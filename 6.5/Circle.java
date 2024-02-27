public class Circle implements GeomatricObject {
    protected double radius;
    public double getPerimeter(double radius) {
        return 2*radius*3.14;
    }
    public double getArea(double radius) {
        return radius*radius*3.14;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
}