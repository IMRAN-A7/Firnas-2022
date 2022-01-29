import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter the number to check odd or even :");
		
		int num = user.nextInt();
		if(num % 2 == 0) {
			System.out.println("It's even");
		}else {
			System.out.println("It's odd");
		}
		
	}
}