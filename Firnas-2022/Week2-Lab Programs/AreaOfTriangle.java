import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height of Triangle: ");
		double height = input.nextDouble();
		System.out.print("Enter the base of Triangle: ");
		double base = input.nextDouble();
		double area = (height*base)/2;
		System.out.println("Area of Triangle is : "+area);
	}
}
