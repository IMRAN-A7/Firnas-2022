import java.util.Scanner;
public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		double side = input.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is : "+area);
	}
}
