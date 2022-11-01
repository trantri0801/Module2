package Abstract.Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(1.7);
        shapes[1] = new Square(5.4);
        shapes[2] = new Rectangle(6.3, 7.6) {
            @Override
            public void howToColor() {

            }
        };
        shapes[3] = new Circle();
        shapes[4] = new Rectangle() {
            @Override
            public void howToColor() {

            }
        };

        shapes[0].Resize(54);
        shapes[1].Resize(75);
        shapes[2].Resize(12);
        shapes[3].Resize(21);
        shapes[4].Resize(39);
    }
}
