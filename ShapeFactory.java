public class ShapeFactory {
    private static final int CIRCLE_LIMIT = 2;
    private static final int SQUARE_LIMIT = 2;
    private static final int TOTAL_LIMIT = 3;
    private static final int RECTANGLE_LIMIT = 2;

    private static int circleCount = 0;
    private static int squareCount = 0;
    private static int totalCount = 0;
    private static int rectangleCount = 0;

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if(totalCount < TOTAL_LIMIT){
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                if (circleCount < CIRCLE_LIMIT) {
                    circleCount++;
                    totalCount++;
                    return new Circle();
                }else{
                    System.out.println("Circle limit reached");
                    return null;
                }
            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                if (squareCount < SQUARE_LIMIT) {
                    squareCount++;
                    totalCount++;
                    return new Square();
                }
                else{
                    System.out.println("Square limit reached");
                    return null;
                }
            }
            else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                if (rectangleCount < RECTANGLE_LIMIT) {
                    rectangleCount++;
                    totalCount++;
                    return new Rectangle();
                }
                else{
                    System.out.println("Rectangle limit reached");
                    return null;
                }
            }
        }else{
            System.out.println("Total limit reached");
        }
        return null;
    }
}
