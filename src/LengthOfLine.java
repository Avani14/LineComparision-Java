
public class LengthOfLine extends Main{
	static float ans1;
	public LengthOfLine(float a,float b,float c,float d)
	{
		ans1= (float) Math.sqrt(Math.pow((a - b),2)+Math.pow((c- d),2));
		System.out.println("Length of line is "+ans1);
	}
	public float lengthCal()
	{
		return ans1;
	}
	
	
}