
public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" Baþarý Ýle Tanýmlandý");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" Baþarý Ýle Güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" Baþarý Ýle Silindi");
		
	}

}
