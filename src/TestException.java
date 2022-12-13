import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
			int a,b;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your Number");
			try
			{
			a=scanner.nextInt();
			b=scanner.nextInt();
			
			System.out.println(a/b);
			}
			catch (Exception x) {
				System.out.println("Enter integer value only. "+x);
				TestException.main(args);
			}
			
	}

}
