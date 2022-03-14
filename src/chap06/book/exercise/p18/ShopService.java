package chap06.book.exercise.p18;

public class ShopService {

	private static ShopService ShopService;
	
	private ShopService() {
		
	}
	public static ShopService getInstance() {
		if(ShopService == null) {
			ShopService = new ShopService();
		}
		return ShopService;
	}

}
