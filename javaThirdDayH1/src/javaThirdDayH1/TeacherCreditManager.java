package javaThirdDayH1;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		//Hesaplamalar
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}
	
	//Kaydederken başka bir işlem daha yapmak istiyorum
	@Override
	public void save() {
		// TODO Auto-generated method stub
		super.save();
	}
	
	//absract sınıflar ve interface'ler asla new' lenemezler!
	

	

}
