public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" Oyunu Baþarý Ýle Eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" Oyunu Baþarý Ýle Güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" Oyunu Baþarý Ýle Silindi");
		
	}

}
