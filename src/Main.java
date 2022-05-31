import java.util.Scanner;

public class Main {
	static float x1;
	static float y1;
	static float x2;
	static float y2;
	static float a1;
	static float b1;
	static float a2;
	static float b2;
	static float l1;
	static float l2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparision computation on master branch");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of x1");
	    x1 = sc.nextFloat();
		System.out.println("Please enter the value of y1");
		 y1 = sc.nextFloat();
		 System.out.println("Please enter the value of x2");
		 x2 = sc.nextFloat();
		 System.out.println("Please enter the value of y2");
		 y2 = sc.nextFloat();
		 ValuesOfLine value = new ValuesOfLine();
		 LengthOfLine lc1 = new LengthOfLine(x1, y1, x2, y2);
		 l1 = lc1.lengthCal();
		 System.out.println("----Enter values for line 2----");
		 System.out.println("Please enter the value of x1");
		 a1 = sc.nextFloat();
		 System.out.println("Please enter the value of y1");
		 b1 = sc.nextFloat();
		 System.out.println("Please enter the value of x2");
		 a2 = sc.nextFloat();
		 System.out.println("Please enter the value of y2");
		 b2 = sc.nextFloat();
		 ValuesOfLine value2 = new ValuesOfLine();
		 LengthOfLine lc2 = new LengthOfLine(a1,b1,a2,b2);
		 l2 = lc2.lengthCal();
		 CompareLines lineComp = new CompareLines(l1,l2);
	}

}

