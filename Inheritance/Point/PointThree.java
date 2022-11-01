package Inheritance.Point;

import java.util.Arrays;

public class PointThree extends PointTwo{
    private float z = 0.0f;

    public PointThree(){

    }

    public PointThree(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXY() {
        float[] array = {
                super.getX(),
                super.getY(),
                this.getZ()
        };
        return array;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.getZ() + ")";
    }
}
class Main{
    public static void main(String[] args) {
        PointThree point3D = new PointThree();
        System.out.println(point3D);

        point3D = new PointThree(1.5f, 7.6f, 5.9f);
        System.out.print(Arrays.toString(point3D.getXY()));
        
    }
}
