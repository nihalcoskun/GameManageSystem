
public interface CampaignService {

	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	void CampaignToOrder(Campaign campaign, Game game);
}
