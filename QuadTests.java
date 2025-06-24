import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class QuadTests {
	//Testing Point.java
	@Test
	public void testDistance(){
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		assertEquals(p1.distance(p2), 1);
	}
	
	@Test
	public void testHashCode(){
		Point p1 = new Point(2,3);
		assertEquals(p1.hashCode(), 21);
	}
	
	@Test
	public void testEqualsItself() {
		Point p1 = new Point(1, 2);
		assertTrue(p1.equals(p1));
	}
	
	@Test
	public void testEqualsNull() {
		Point p1 = new Point(1, 2);
		assertFalse(p1.equals(null));
	}
	
	@Test
	public void testEqualsClass() {
		Point p1 = new Point(1, 2);
		Integer num = 10;
		assertFalse(p1.equals(num));
	}
	
	@Test
	public void testEqualsX() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 2);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	public void testEqualsY() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 5);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	public void testEqualsSame() {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		assertTrue(p1.equals(p2));
	}
	
	//Testing Quadrilateral.java
	@Test
	public void testPerimeter(){
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,0);
		Point p3 = new Point(3,4);
		Point p4 = new Point(0,4);

		Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);

		double expected = p1.distance(p2) + p2.distance(p3) + p3.distance(p4) + p4.distance(p1);
		assertEquals(expected, q.perimeter());
	}
	
	@Test
	public void testIsParallelogramTrue(){
		Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(5, 2);
        Point p4 = new Point(1, 2);

        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertTrue(q.isParallelogram());
	}
	

	@Test
	public void testIsParallelogramFalse(){
		Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(2, 0);
        Point p4 = new Point(3, 0);

        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertFalse(q.isParallelogram());
	}
	
	@Test
	public void testIsParallelogramFalseFirst(){
		Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(5, 0);
        Point p4 = new Point(0, 1);

        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertFalse(q.isParallelogram());
	}
	
	@Test
	public void testIsParallelogramFalseSecond(){
		Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(4, 0);
        Point p4 = new Point(2, 1);

        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertFalse(q.isParallelogram());
	}
}
