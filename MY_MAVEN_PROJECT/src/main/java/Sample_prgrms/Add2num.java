package Sample_prgrms;
import java.util.Scanner;
public class  Add2num{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter you name");
		String name = input.nextLine();
		System.out.println("Enter you age");
		int age = input.nextInt();
		System.out.println("Enter you weight");
		float weight = input.nextFloat();
		System.out.println("Enter you firstletter");
		char firstletter = input.next().charAt(0);
		
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your weight is "+weight);
		System.out.println("your firstletter is "+firstletter);

	}

}
