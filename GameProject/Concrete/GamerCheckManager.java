
public class GamerCheckManager implements IGamerCheckService {

	MernisServiceAdapter mernisServiceAdaptor = new MernisServiceAdapter();
	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {					
		return mernisServiceAdaptor.checkIfRealPerson(gamer);
	}

}
