
public class OrderManager implements OrderService {

	@Override
	public void calculateOrder(Game game) {
		System.out.println("Sipari� �creti: " + game.getGamePrice());
		
	}

}
