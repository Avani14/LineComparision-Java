
public class CompareLines extends Main {

	public CompareLines(float l1, float l2) {
		
		// TODO Auto-generated constructor stub
		if(l1 == l2)
		{
			System.out.println("Lines are equal");
		}
		else
		{
			System.out.println("Lines are not equal");
			if(l1>l2)
			{
				System.out.println("Line 1 of length "+l1+" is greater than line 2 of length "+l2);
			}
			else
			{
				System.out.println("Line 2 of length "+l2+" is greater than line 1 of length "+l1);
			}
		}
	}
	
}
