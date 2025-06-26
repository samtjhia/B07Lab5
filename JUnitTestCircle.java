package lab5;
import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTestCircle {

    @Test
    public void testCircumference() {
        Circle c = new Circle(new Point(0, 0), 5);
        double expected = 2 * Math.PI * 5;
        assertEquals(expected, c.circumference(), 0.0001);
    }

    @Test
    public void testEqualsSameRadius() {
        Circle c1 = new Circle(new Point(0, 0), 3);
        Circle c2 = new Circle(new Point(1, 1), 3);
        assertTrue(c1.equals(c2));
    }
    

    @Test
    public void testEqualsDifferentRadius() {
        Circle c1 = new Circle(new Point(0, 0), 3);
        Circle c2 = new Circle(new Point(0, 0), 4);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEqualsNull() {
        Circle c1 = new Circle(new Point(0, 0), 3);
        assertFalse(c1.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Circle c1 = new Circle(new Point(0, 0), 3);
        String notACircle = "Not a circle";
        assertFalse(c1.equals(notACircle));
    }

    @Test
    public void testEqualsEqualCircle() {
        Circle c1 = new Circle(new Point(0, 0), 5);
        Circle c2 = new Circle(new Point(0, 0), 5);
        assertTrue(c1.equals(c2));  
    }

   
}