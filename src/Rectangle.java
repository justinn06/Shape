public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    public Rectangle(double w, double l, String c, boolean f) {
        this.width = w;
        this.length = l;
        super.color = c;
        super.filled = f;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return (2*length)+(2*width);
    }

    public String toString() {
        return "Rectangle is " + getColor() + " and " + isFilled() +
                " with a length of " + getLength() + " and a width of " + getWidth();
    }

}
