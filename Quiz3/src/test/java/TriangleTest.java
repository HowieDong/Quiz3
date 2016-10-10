import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {	
	@Test
	public void testArea(){
		Triangle testTriangle = new Triangle(3.0,4.0,5.0);
		double testing = testTriangle.getArea();
		double calculation = 6.0;
		assertEquals(testing == calculation, true);
	}
	@Test
	public void testPerimeter(){
		Triangle testTriangle = new Triangle(3.0,4.0,5.0);
		double testing = testTriangle.getPerimeter();
		double calculation1 = 12.0;
		assertEquals(testing == calculation1,true);
	}
}
