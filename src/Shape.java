public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }
    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String c) {
        this.color = c;
    }
    public String isFilled() {
        if (this.filled == true)
            return "filled";
        else
            return "not filled";
    }
    public void setFilled(boolean f) {
        this.filled = f;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString() {
        return "Shape is " + getColor() + " and " + isFilled();
    }


}
