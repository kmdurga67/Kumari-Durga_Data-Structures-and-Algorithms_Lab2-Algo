package client;

import service.CurrencyService;

public class CurrencyClient {
	
	public static void main(String[] args) {
		CurrencyService service = new CurrencyService();
		int[] denominators = new int[] {500, 200, 100, 50, 20, 10};
		service.denominatorService(denominators, 3650);
	}

}

