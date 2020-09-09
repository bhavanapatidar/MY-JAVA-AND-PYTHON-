package add;
//calss and object
class perso{
	
	//instance variables(data or "state")
	String name;
	int age;
//class can contain
	//1. Data
	//2. methods
	void speak() {
	System.out.println("hlwwww");
	}

}
public class app2 {

	public static void main(String[] args) {
		
		perso perso1=new perso();
		perso1.name="bhavana patidar";
		perso1.age=17;
		// call speak
		perso1.speak();
		
		perso perso2=new perso();
		perso2.name="tanishk patidar";
		perso2.age=12;
		System.out.println(perso1.name);
		//again we can call here
		perso2.speak();
	}
}

