
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� olu�turuldu!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� silindi!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� g�ncellendi!");
		
	}

	@Override
	public void CampaignToOrder(Campaign campaign, Game game) {
		System.out.println(campaign.getCampaignName() + " S�PAR���N�ZE UYGULANDI !");
        System.out.println("--------------------------------------------------");

        int newOrder = (int) (game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscountRate()) / 100));

        System.out.println("KAMPANYALI F�YAT : " + newOrder);
	}

}
