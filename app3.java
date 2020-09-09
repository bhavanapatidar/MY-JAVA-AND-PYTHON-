package add;
//calss and object
class per{
	
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
public class app3 {

	public void main(String[] args) {
		
		per per1=new per();
		per1.name="bhavana patidar";
		per1.age=17;
		// call speak
		per1.speak();
		int years = per1.calculateYearsToRetirement();
		System.out.println("years till requirement"+years);
		
		per per2=new per();
		per2.name="tanishk patidar";
		per2.age=12;
		System.out.println(per1.name);
		//again we can call here
		per2.speak();
	}

}
