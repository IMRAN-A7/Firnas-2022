import java.util.Scanner;
public class WhileLoopDemonstration{
	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any integer under 10: ");
		
		number = sc.nextInt();
		
		while(number<=10) {
			sum = sum+number;
			number++;
		}System.out.format("Sum of numbers from while loop is : %d",sum);
	}
}