
public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" Ba�ar� �le Tan�mland�");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" Ba�ar� �le G�ncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" Ba�ar� �le Silindi");
		
	}

}
