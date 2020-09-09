package add;
import java.util.Scanner;

public class scanner  {

		public static void main(String[] args)
		{
			int x,y,z;
			System.out.println("enter the two integer to add");
			Scanner in = new Scanner(System.in);
			x=in.nextInt();
			y=in.nextInt();
			z=x+y;
			System.out.println("sum of integers="+z);
		}
	}


