package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory;

import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Color.Color;
import np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory.Shapes.Shape;

/**
 * Created by MM on 2017-06-08.
 */
public class AbstractFactoryDemoMain {

    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();
    }
}
