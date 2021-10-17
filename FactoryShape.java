package ApDung;

public class FactoryShape {
    private FactoryShape() {
    }

    public static Shape getShape(ShapeType shapeType) throws Exception {
        Shape shape;
//        if(shapeType == null){
//            return null;
//        }
//        if(shapeType.equalsIgnoreCase("CIRCLE")){
//            return new Circle();
//        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
//            return new Rectangle();
//        } else if(shapeType.equalsIgnoreCase("SQUARE")){
//            return new Square();
//        }
//        return null;
//        else {
            switch (shapeType){
                case RECTANGLE:
                    shape = new Rectangle();
                  break;
                case SQUARE:
                    shape = new Square();
                    break;
                case CIRCLE:
                    shape = new Circle();
                    break;
                default:
                    throw new Exception();
            }
            return shape;
//        }
//        return null;
    }
}
