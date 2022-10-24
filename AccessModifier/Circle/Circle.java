package AccessModifier.Circle;

public class Circle {
    private static double radius = 1.0;
    private String Color = "red";

    public double getRadius() {

        return radius;
    }

    public String getColor() {
        return Color;
    }

    Circle() {

    }

    public void Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2); // Math.PI là nhân với số PI còn Math.pow là số mũ
    }

    @Override
    public String toString() {
        return "Circle radius = " + this.getRadius() + ", dien tich hinh tron = " + getArea();
    }
}
