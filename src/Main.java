public class Main {
    public static void main(String[] args) {

        Shape c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3, "blue", false);

        System.out.println(c1.toString());
        System.out.println(c2.getPerimeter());
        System.out.println(c3.getArea());

        Rectangle r1 = new Rectangle(2, 3, "yellow", true);

        System.out.println(r1.toString());

        Rectangle s1 = new Square();
        System.out.println(s1.toString());
        System.out.println(s1.getArea());


    }
}
