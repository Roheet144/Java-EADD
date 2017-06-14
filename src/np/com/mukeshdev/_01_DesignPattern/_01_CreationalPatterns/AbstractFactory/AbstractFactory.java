package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory;

import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Color;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Shape;

/**
 * Created by MM on 2017-06-14.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
