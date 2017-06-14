package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory;

import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Shape;

/**
 * Created by MM on 2017-06-08.
 */
public class AbstractFactoryDemoMain {

    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape=shapeFactory.getShape("Circle");

        shape.draw();
    }
}
