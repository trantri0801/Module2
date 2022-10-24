package Inheritance.Circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", area='" + getArea() + '\'' +
                ", Volume='" + getVolume() + '\'' +
                '}';
    }
}
class MainTest{
    public static void main(String[] args) {
        Circle TempOne = new Cylinder();
        System.out.println(TempOne);

        TempOne = new Cylinder(4.0, "black", 6);
        System.out.println(TempOne);
    }

}
