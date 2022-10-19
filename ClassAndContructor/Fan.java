package ClassAndContructor;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW; // toc do
    private boolean on = false; // bat hay tat
    private double radius = 5; //ban kinh
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan is on" +
                    " speed = " + this.getSpeed() +
                    ", radius = " + this.getRadius() +
                    ", color = '" + this.getColor() + '\'';
        } else {
            return "Fan is off" +
                    " radius = " + this.getRadius() +
                    ", color = '" + this.getColor() + '\'';
        }
    }

    public static void main(String[] args) {
        Fan FanOne = new Fan();
        FanOne.setOn(true);
        FanOne.setSpeed(FanOne.FAST);
        FanOne.setRadius(10);
        FanOne.setColor("Yellow");
        Fan FanTwo = new Fan();
        FanTwo.setOn(false);
        FanTwo.setSpeed(FanTwo.MEDIUM);
        FanTwo.setRadius(5);
        FanTwo.setColor("Blue");
        System.out.println(FanOne.toString());
        System.out.println(FanTwo.toString());
    }
}
