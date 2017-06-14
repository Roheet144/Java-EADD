package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.FactoryPattern;

/**
 * Created by MM on 2017-06-08.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }

        if(shapeType.equalsIgnoreCase("Square")){
            return new Rectangle();
        }

        if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }

        return null;
    }
}
