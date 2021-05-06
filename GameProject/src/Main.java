import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1, "Street Fighter",500,"Video Oyunu");
		Game game2 = new Game(2, "Bombacý",25, "Atari Oyunu");
		Game game3 = new Game(3, "Need For Speed",750,"Bilgisayar Oyunu");
		
		Gamer gamer1 = new Gamer(1, "ferate", "22967500652", "Ferat", "EFÝL",LocalDate.of(1981, 9, 1));
		Gamer gamer2 = new Gamer(2, "baho", "12345698745", "Bahadýr", "EFÝL", LocalDate.of(2007, 5, 17));
		
		Campaign campaign1 = new Campaign(1, "Yeni Yýl Kampanyasý", 10, LocalDate.of(2020, 12, 1),LocalDate.of(2020, 12, 31));
		Campaign campaign2 = new Campaign(2, "Ramazan Bayramý Kampanyasý", 20, LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 30));
						
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game2);
		gameManager.delete(game3);
		System.out.println("---------------------------------");
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gamerManager.update(gamer2);
		gamerManager.delete(gamer2);
		System.out.println("---------------------------------");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign2);
		campaignManager.delete(campaign1);
		System.out.println("---------------------------------");
		        
		SaleManager saleManager = new SaleManager();
		saleManager.add(game2, gamer1, campaign2);		
		
	}

}
