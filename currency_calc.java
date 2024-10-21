package First;
import java.util.*;

public class currency {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount you want to convert");
		double price=sc.nextInt();

		double i=83,US;
		US =price*i;
		System.out.println("price of doller in indian rupees :"+ US );
		
		double iu=92,europe;
		europe=price*iu;
		System.out.println("price of Euro is inidan rupees :"+europe);
		
		double id=0.86,russia;
		russia=price*id;
		System.out.println("price of Rubel is inidan rupees :"+russia);
		
		double ip=109.84,UK;
		UK=price*ip;
		System.out.println("price of pound is inidan rupees :"+UK);
		sc.close();
	}

}
