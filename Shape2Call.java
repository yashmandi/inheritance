public class Shape2Call {
    public static void main(String[] args) {
        double r = 5.0;
        Circle circle = new Circle(r);
        System.out.println("Radius of the circle: " + r);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
