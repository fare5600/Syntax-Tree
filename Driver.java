public class Driver 
{
	public static void main(String[] args)
	{
		
		Parser p1 = new Parser("     a =     (a *   b) - c;");
		Parser p2 = new Parser("a = ((a+k) * (a + (b/n))) - c;");
		p1.parse();
		p2.parse();
		
		Parser p = new Parser("     apple =     (a *   b) - c;");
		p.parse();
	}
}