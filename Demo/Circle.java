package Demo;

public class Circle {
    //có những thuộc tính mô tả bán kính, màu sắc
    private double radius;
    private String color;
    final double PI = 3.14;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //các getter/setter cho các thuộc tính đó
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //thuộc tính liên đới như diện tích
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    //đè phương thức toString để in ra thông tin chi tiết các thuộc tính của đổi tượng
    @Override
    public String toString() {
        return "Circle with " +
                "radius= " + getRadius() +
                " and color= '" + getColor() + '\'' +
                ", area= " + getArea();
    }
}
class Main {
    public static void main(String[] args) {
        Circle circleTest = new Circle();
        System.out.println(circleTest);
        Circle circle1 = new Circle(2, "blue");
        System.out.println(circle1);
    }
}
