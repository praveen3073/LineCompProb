import java.util.*;

public class LineCompProb {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Line line = new Line(4,3,2,1);
		System.out.println("The length of line is: "+calcLineLength(line));
		checkLineEquality();
		compareLines();
	}
	public static double calcLineLength(Line line)
	{
		double lineLength = Math.sqrt(Math.pow(line.x2-line.x1,2)+Math.pow(line.y2-line.y1,2));
		return lineLength;
	}
	public static void checkLineEquality()
	{
		Line line1 = new Line(4,3,2,1);
		Line line2 = new Line(10,9,8,7);
		if( Double.toString( calcLineLength(line1) ).equals( Double.toString( calcLineLength(line2) ) ))
			System.out.println("The lines are equal.");
		else
			System.out.println("The lines are not equal.");
	}
	public static void compareLines()
	{
		Line line1 = new Line(4,3,2,1);
		Line line2 = new Line(10,9,8,6);
		int lineLenDiff = Double.toString( calcLineLength(line1) ).compareTo( Double.toString( calcLineLength(line2) ) );
		if(lineLenDiff==0)
			System.out.println("The lines are equal.");
		else if(lineLenDiff>0)
			System.out.println("Line1 is greater than line2.");
		else
			System.out.println("Line1 is lesser than line2.");
	}
}
