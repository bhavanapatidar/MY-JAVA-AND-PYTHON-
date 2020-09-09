package add2;

class frog{
	String name;
	int age;
	public String getname() {
		
		return name;
	}
	public int getage() {
		
		return age;
	}
	
}
public class app9{
	public static void main(String[] args) {
		
		frog frog1=new frog();
		frog1.name="bartie";
		frog1.age=3;
		System.out.println("frog1 name is:" +frog1.getname());
		frog frog2=new frog();
		frog2.name="gambir";
		frog2.age=2;
		System.out.println("frog2 name is:" +frog2.getname());
		System.out.println("frog2 age is:" +frog2.getage());
	}
	
}