package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory;

import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Color;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Circle;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Rectangle;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Shape;

/**
 * Created by MM on 2017-06-08.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Rectangle();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
