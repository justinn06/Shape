import java.math.*;
public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super.color = c;
        super.filled = f;
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI*(getRadius()*getRadius());
    }

    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    public String toString() {
        return "Circle is " + getColor() + " and " + isFilled() + " with a radius of " + getRadius();
    }

}
