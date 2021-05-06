
public class GamerManager implements IGamerService{

	private IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;		
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer))
		{
			System.out.println("Oyuncu "+gamer.getFirstName()+" "+gamer.getLastName()+" Ekleme ��lemi Ba�ar� �le Tamamland�");
		}
		else
		{
			System.out.println("Oyuncu Bilgileri Mernisten Do�rulanamad�");
			System.out.println("Oyuncu "+gamer.getFirstName()+" "+gamer.getLastName()+" Ekleme ��lemi Yap�lamad�");
		}		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu G�ncelleme ��lemleri Ba�ar� �le Tamamland�");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silme ��lemi Ba�ar� �le Tamamland�");
		
	}

}
