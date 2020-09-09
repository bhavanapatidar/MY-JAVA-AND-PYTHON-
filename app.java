package add;
//calss and object
class pers{
	
	//instance variables(data or "state")
	String name;
	int age;
//class can contain
	//1. Data
	//2. methods
	void speak() {
		for(int i=0;i<5;i++) {
	System.out.println("my name is:"+ name+"and i m "+age+"years old");
	}
	}

}
public class app {

	public static void main(String[] args) {
		
		pers pers1=new pers();
		pers1.name="bhavana patidar";
		pers1.age=17;
		// call speak
		pers1.speak();
		
		pers pers2=new pers();
		pers2.name="tanishk patidar";
		pers2.age=12;
		System.out.println(pers1.name);
		//again we can call here
		pers2.speak();
	}
}

