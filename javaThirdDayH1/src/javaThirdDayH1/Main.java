package javaThirdDayH1;

public class Main {

	public static void main(String[] args) {
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		
//		
//		int[] sayilar1 = new int[] {1,2,3};
//		int[] sayilar2 = new int[] {10,20,30};
//		sayilar1 = sayilar2;
//		sayilar2[0] = 1000;
//		
//		System.out.println("----------Referans tip-----------");
//		System.out.println(sayilar1[0]);
//		
//		System.out.println("---------Değer tip----------");
//		
//		System.out.println(sayi1);
//		
//		System.out.println("----------Classes-----------");
//		
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.save();
//		
//		Customer customer = new Customer();
//		customer.id = 1;
////		customer.firstName = "Emirhan";
////		customer.lastName = "Art";
////		customer.nationalIdenty = "12343234565";
//		customer.city = "Ankara";
//		
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//		
//		Company company = new Company();
//		company.taxNumber = "123413412345";
//		company.companyName = "Bosch";
//		company.id = 2;
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		
//		Person person = new Person();
//		person.firstName = "Sevil";
//		person.nationaIdenty = "2";
//		
		//Ioc Container (new leme için)
		//Interface' nin amacı yazılımda ki if kodlarından kurtulmak ve bağımlılıkları engellemektir)
		//Bir class sadece bir class' ı inherit edebilir.
		//Bir class birden fazla interface' yi inherit edebilir.
		//SOLID
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
	}

}
