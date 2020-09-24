import java.util.*;

public class LineCompProb {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		calcLineLength();
		checkLineEquality();
	}
	public static void calcLineLength()
	{
		Line line = new Line(4,3,2,1);
		double lineLength = Math.sqrt(Math.pow(line.x2-line.x1,2)+Math.pow(line.y2-line.y1,2));
		System.out.println("The length of line is: "+lineLength);
	}
	public static void checkLineEquality()
	{
		Line line1 = new Line(4,3,2,1);
		Line line2 = new Line(4,3,2,4);
		if(line1.equals(line2))
			System.out.println("The lines are equal.");
		else
			System.out.println("The lines are not equal.");
	}
}
