package Abstract.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public void Resize(double Percent) {
        System.out.println("Area before resizing: "+getArea());
        double newSize = Percent*getSide()/100;
        System.out.println("Area after resizing: "+Math.pow(newSize,2));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
