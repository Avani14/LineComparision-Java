
public class LengthOfLine extends ValuesOfLine {

	public LengthOfLine(float x1, float y1, float x2, float y2) {
		super(x1, y1, x2, y2);
		// TODO Auto-generated constructor stub
		
	}
	public void lenghtCalculation()
	{
		float ans = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("The length of the line is "+ans);
	}
	
}
