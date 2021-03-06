
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası oluşturuldu!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası silindi!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası güncellendi!");
		
	}

	@Override
	public void CampaignToOrder(Campaign campaign, Game game) {
		System.out.println(campaign.getCampaignName() + " SİPARİŞİNİZE UYGULANDI !");
        System.out.println("--------------------------------------------------");

        int newOrder = (int) (game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscountRate()) / 100));

        System.out.println("KAMPANYALI FİYAT : " + newOrder);
	}

}
