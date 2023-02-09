public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1;
    }
    public Square(double s) {
        this.side = s;
    }
    public Square(double s, String c, boolean f) {
        this.side = s;
        super.color = c;
        super.filled = f;
    }

    public double getSide() {
        return this.side;
    }
    public void setSide(double s) {
        this.side = s;
    }

    public String toString() {
        return "Square is " + getColor() + " and " + isFilled() +
                " with sides of " + getSide();
    }

}
