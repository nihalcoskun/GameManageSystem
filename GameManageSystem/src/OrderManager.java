
public class OrderManager implements OrderService {

	@Override
	public void calculateOrder(Game game) {
		System.out.println("Sipariþ ücreti: " + game.getGamePrice());
		
	}

}
