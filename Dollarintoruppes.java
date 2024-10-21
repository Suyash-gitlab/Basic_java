package First;
import java.util.*;

public class Dollertoindian {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many dollar you want to convert :");
		double s=sc.nextInt();
		double x=s*83.89;
		System.out.println("The amount is "+x);
		sc.close();
	}

}
