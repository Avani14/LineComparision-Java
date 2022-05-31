import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of x1");
		float x1 = sc.nextFloat();
		System.out.println("Please enter the value of y1");
		float y1 = sc.nextFloat();
		System.out.println("Please enter the value of x2");
		float x2 = sc.nextFloat();
		System.out.println("Please enter the value of y2");
		float y2 = sc.nextFloat();
		ValuesOfLine value = new ValuesOfLine(x1, y1, x2, y2);
		LengthOfLine lol = new LengthOfLine(x1, y1, x2, y2);
		lol.lenghtCalculation();
	}

}
