package javaThirdDayH1;

public abstract class BaseCreditManager implements ICreditManager {

	public abstract void calculate(); //ortak metot değildir

	@Override
	public void save() {
		System.out.println("Kaydedildi");
		
	}

}
