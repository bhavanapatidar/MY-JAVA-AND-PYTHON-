package add2;
class robo{
	public void speak(String text) {
		
		System.out.println(text);
	}
	public void jump(int height) {
		
		System.out.println("jumping:" +height);
	}
	public void move(String direction, double distance) {
		
		System.out.println("moving " + distance + " metres in direction " + direction);
	}
}
public class app8{
public static void main(String[] args) {
	
	robo bhavana = new robo();
	bhavana.speak("u r the best");
	bhavana.jump(5);
	bhavana.move("west",9.3);
	String greeting = "hello";
	bhavana.speak(greeting);
	int value = 17;
	bhavana.jump(value);
}
}