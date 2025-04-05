package opps;

public class AbstractCircle4 extends AbstractShape4{

	public void displayShape() {
		System.out.println("Shape is Circle");
		
	}
public static void main(String[] args) 
{
AbstractShape4 s1 = new AbstractCircle4();
AbstractShape4 s2 = new AbstractTriangle4();
s1.displayShape();
s2.displayShape();
}
}
