public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2.5);

        double s = rectangle.Square();
        double p = rectangle.Perimeter();

        System.out.println("Square = " + s);
        System.out.println("Perimeter = " + p);

        Triangle triangle = new Triangle(1, 3, 3);

        double s1 = triangle.Square();
        double p1 = triangle.Perimeter();

        System.out.println("Square = " + s1);
        System.out.println("Perimeter = " + p1);

        Circle circle = new Circle(3);

        double s2 = circle.Square();
        double p2 = circle.Perimeter();

        System.out.println("Square = " + s2);
        System.out.println("Perimeter = " + p2);
    }
}