import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double radius = input.nextDouble();
		double area = Math.PI*(radius*radius);
		System.out.println("Area of the circle is :"+area);
		double circumference = Math.PI*2*radius;
		System.out.println("Circumference of the circle is :"+circumference);
	}
}
