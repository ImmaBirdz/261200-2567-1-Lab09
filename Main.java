public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        Shape circle1 = ShapeFactory.getShape("CIRCLE");
        Shape circle2 = ShapeFactory.getShape("CIRCLE");
        Shape square = ShapeFactory.getShape("SQUARE");
        Shape square1 = ShapeFactory.getShape("SQUARE");
        Shape square2 = ShapeFactory.getShape("SQUARE");
        Shape rectangle1 = ShapeFactory.getShape("RECTANGLE");
        Shape rectangle2 = ShapeFactory.getShape("RECTANGLE");
    }
}