
public class Main {
	public static void main(String[] args) {

	Game game1 = new Game(1 , "Valorant" , 30);
	Game game2 = new Game(2, "PUBG", 50);
	Game game3 = new Game(3, "Sims", 40);
	
	GameService gameManager = new GameManager();
	gameManager.add( new Game(4, "GTA", 45));
	gameManager.delete(game3);
	
	
	Gamer gamer1 = new Gamer(1, "Nihal", "Coskun", 2000, "12345678910");
	Gamer gamer2 = new Gamer(2, "Ayse" , "Yýlmaz", 2015, "10987654321");
	Gamer gamer3 = new Gamer(3, "Ali", "Yalcin", 1998, "4632585478");
	
	GamerManager gamerManager = new GamerManager(new ValidationManager());
	gamerManager.add(gamer1);
	gamerManager.delete(gamer2);
	gamerManager.update(gamer3);
	
	Campaign campaign1 = new Campaign("YENÝ OYUNCU", 15);
    Campaign campaign2 = new Campaign("SÖMESTR", 10);

   
    OrderManager orderManager = new OrderManager();
    orderManager.calculateOrder(game1);

    CampaignManager campaignManager = new CampaignManager();
    campaignManager.CampaignToOrder(campaign1, game1);
    campaignManager.delete(campaign2);
	}
}