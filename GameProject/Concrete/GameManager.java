public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" Oyunu Ba�ar� �le Eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" Oyunu Ba�ar� �le G�ncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" Oyunu Ba�ar� �le Silindi");
		
	}

}
