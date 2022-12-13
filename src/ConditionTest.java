import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

		int total;
		System.out.println("What is your total marks ?");
		Scanner scanner=new Scanner(System.in);
		total=scanner.nextInt();
		if (total>60) {
			
			System.out.println("Pass with first divison");
		} 
		else if(total>=45)
		{
			System.out.println("Pass with second divison");
		}
		else if(total>30)
		{
			System.out.println("Pass with third divison");
		}
		
		
		else {
			System.out.println("Not pass with Any divison");
		}
				

	}

}
