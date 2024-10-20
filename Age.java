package First;
import java.util.*;

public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your birth year");
		int age=sc.nextInt();
		int cy=2024;
		age=cy-age;
		System.out.println("The current age is "+age);
		sc.close();
	}

}
