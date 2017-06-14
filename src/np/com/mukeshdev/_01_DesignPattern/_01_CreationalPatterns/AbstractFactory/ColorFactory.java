package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory;

import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Blue;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Color;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Green;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Red;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Shape;

/**
 * Created by MM on 2017-06-14.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}