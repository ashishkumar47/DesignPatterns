/**
 * @ author  ashishKumar
 * @ since 24-02-2024 10:02 pm
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        switch (shapeType){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return new Square();
        }
    }
}
