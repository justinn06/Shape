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

    

}
