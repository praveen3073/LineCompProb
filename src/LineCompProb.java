

public class LineCompProb {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Point point1 = new Point(4,2);
		Point point2 = new Point(3,1);
		Point point3 = new Point(11,8);
		Point point4 = new Point(9,6);
		Line line1 = new Line(point1,point2);
		Line line2 = new Line(point3,point4);
		System.out.println("The length of line1 is: "+calcLineLength(line1));
		System.out.println("The length of line2 is: "+calcLineLength(line2));
		checkLineEquality(line1, line2);
		compareLines(line1, line2);
	}
	public static double calcLineLength(Line line)
	{
		double lineLength = Math.sqrt(Math.pow(line.point2.x-line.point1.x,2)+Math.pow(line.point2.y-line.point1.y,2));
		return lineLength;
	}
	public static void checkLineEquality(Line line1, Line line2)
	{
		if( Double.toString( calcLineLength(line1) ).equals( Double.toString( calcLineLength(line2) ) ))
			System.out.println("The two lines are equal.");
		else
			System.out.println("The two lines are not equal.");
	}
	public static void compareLines(Line line1, Line line2)
	{
		int lineLenDiff = Double.toString( calcLineLength(line1) ).compareTo( Double.toString( calcLineLength(line2) ) );
		if(lineLenDiff==0)
			System.out.println("The two lines are equal.");
		else if(lineLenDiff>0)
			System.out.println("Line1 is greater than line2.");
		else
			System.out.println("Line1 is lesser than line2.");
	}
}
