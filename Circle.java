package lab5;

public class Circle {
	Point O; 
	double radius; 
	
	public Circle(Point O, double radius) {
		this.O = O; 
		this.radius = radius; 
	}
	
	public double circumference() {
		return 2 * Math.PI * radius; 
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2); 
	}
	
	@Override
	public int hashCode() {
		return (int)(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

}
