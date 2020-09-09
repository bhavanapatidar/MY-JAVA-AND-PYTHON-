package add;
//calss and object
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
public class app4{

	public void main(String[] args) {
		
		pe pe1=new pe();
		pe1.name="bhavana patidar";
		pe1.age=17;
		// call speak
		pe1.speak();
		int years = pe1.calculateYearsToRetirement();
		System.out.println("years till requirement"+years);
		
		pe pe2=new pe();
		pe2.name="tanishk patidar";
		pe2.age=12;
		System.out.println(pe1.name);
		//again we can call here
		pe2.speak();
	}

}
