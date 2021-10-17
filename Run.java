package ApDung;

public class Run {
    public static void main(String[] args) throws Exception {
        Shape circle = FactoryShape.getShape(ShapeType.CIRCLE);
        Shape square = FactoryShape.getShape(ShapeType.SQUARE);
        Shape rectangle = FactoryShape.getShape(ShapeType.RECTANGLE);
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
