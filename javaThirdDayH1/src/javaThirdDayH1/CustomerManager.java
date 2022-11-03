package javaThirdDayH1;

public class CustomerManager {
	
	/*
	 * public void Save(int id, String firstName, String lastName, String
	 * nationalIdenty) 
	 * { 
	 *    System.out.println("Müşteri kaydedildi"); 
	 * }
	 * 
	 * Bu kodlama şekli doğru değildir, ilerde isterler değişince, yeni eklenen parametre 
	 * her sayfada ayrı ayrı yazılmak sorunda kalınır. Bunun yerine property class'ı 
	 * "save" metoduna, parametre olarak verilir. Buna Encapsulation(Kapsülleme) denilir.
	 */
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	
	public void save() {
		System.out.println("Müşteri kaydedildi : " + _customer.id);
	}
	
	public void delete() {
		System.out.println("Müşteri silindi : " + _customer.id);
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi");
	}

}
