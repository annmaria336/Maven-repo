
package Sample_prgrms;
import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = input.nextInt();
		if(age>=50)
		{
			System.out.println("Senior Citizen");
		}
		else if(age<50 && age>=24)
		{
			System.out.println("Citizen");
		}
		else if(age<24 && age>=13)
		{
			System.out.println("Youth");
		}
		else if(age<13 && age>=1)
		{
			System.out.println("kid");
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
