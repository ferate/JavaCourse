
public class GamerManager implements IGamerService{

	private IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;		
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer))
		{
			System.out.println("Oyuncu "+gamer.getFirstName()+" "+gamer.getLastName()+" Ekleme Ýþlemi Baþarý Ýle Tamamlandý");
		}
		else
		{
			System.out.println("Oyuncu Bilgileri Mernisten Doðrulanamadý");
			System.out.println("Oyuncu "+gamer.getFirstName()+" "+gamer.getLastName()+" Ekleme Ýþlemi Yapýlamadý");
		}		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncelleme Ýþlemleri Baþarý Ýle Tamamlandý");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silme Ýþlemi Baþarý Ýle Tamamlandý");
		
	}

}
