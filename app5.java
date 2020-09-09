package add2;
class pe{
	
	//instance variables(data or "state")
	String name;
	int age;
//class can contain
	//1. Data
	//2. methods
	void speak() {
	System.out.println("my name is:"+ name);
	}
		int calculateYearsToRetirement() {
			int yearsLeft= 65 - age;
			return yearsLeft;
		}
	}
public class app5{

	public static void main(String[] args) {
		
		pe pe1=new pe();
		pe1.name="bhavana ";
		pe1.age=16;
		// call speak
		pe1.speak();
		int years = pe1.calculateYearsToRetirement();
		System.out.println("years till requirement"+years);
		
		
	}

}
