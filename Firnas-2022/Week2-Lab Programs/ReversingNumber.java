import java.util.Scanner;
class ReversingNumber {
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for reversing :");
		num = input.nextInt();
		while(num != 0) {
			reversenum = reversenum*10;
			reversenum = reversenum + num%10;
			num = num/10;
		}System.out.println("Reversing Number is :"+reversenum);
	}
}
