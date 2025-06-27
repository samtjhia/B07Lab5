package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {
	// area method tests
	@Test
	void testArea_no_radius() {
		Point p1 = new Point(0,0);
		Circle c1 = new Circle(p1,0);
		assertEquals(c1.area(0), 0);
	}
	@Test
	void testArea() {
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1,5.5);
		assertEquals(c1.area(5.5), Math.PI*(Math.pow(5.5,2)));
	}
	// hashCode tests
	@Test
	void test_hashCode_same() {
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1,4.2);
		Point p2 = new Point(2,1);
		Circle c2 = new Circle(p2,4.2);
		assertEquals(c1.hashCode(),c2.hashCode());
	}
	@Test
	void test_hashCode_diff() {
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1,4.2);
		Point p2 = new Point(2,1);
		Circle c2 = new Circle(p2,2);
		assertNotEquals(c1.hashCode(),c2.hashCode());
	}
	
	

}
