public Class Quadrilateral {

    Point A;
    Point B;
    Point C;
    Point D;
    
    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    public boolean isParallelogram() {
        return (A.distance(B) == C.distance(D)) && (B.distance(C) == D.distance(A));g
    }
}