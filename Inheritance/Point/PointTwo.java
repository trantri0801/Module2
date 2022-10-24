package Inheritance.Point;

public class PointTwo {
    private float x = 0.0f;
    private float y = 0.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public PointTwo(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public PointTwo(){

    }

    public float[] getXY() {
        return new float[]{
                this.getX(),
                this.getY()
        };
    }

    @Override
    public String toString() {
        return "PointTwo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
