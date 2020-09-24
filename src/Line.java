
public class Line {
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	public Line(int x1, int x2, int y1, int y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	@Override
	public boolean equals(Object obj)
	{
		Line lineObj = (Line) obj;
		return lineObj.x1==this.x1 && lineObj.x2==this.x2 && lineObj.y1==this.y1 && lineObj.y2==this.y2;
	}
}
