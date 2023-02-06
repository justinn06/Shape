public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3, "blue", false);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());


    }
}
