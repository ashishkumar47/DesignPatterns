/**
 * @ author  ashishKumar
 * @ since 24-02-2024 09:58 pm
 */
public class MainClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shape=shapeFactory.getShape("");
        shape.draw();
    }
}
