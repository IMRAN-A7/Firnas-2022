import java.util.Scanner;
public class FloydTriangle{
	public static void main(String[] args) {
		int rows, number=1,counter,j;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows for Floyd Triangle :");
		
		rows = input.nextInt();
		System.out.println("Floyd's Triangle");
		
		for(counter = 1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+ " ");
				number++;
			}System.out.println();
		}
		
	}
}