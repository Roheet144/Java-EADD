package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.FactoryPattern;

/**
 * Created by Mm on 2017-06-08.
 */
public class FactoryPatternDemoMain {

    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape=shapeFactory.getShape("Circle");

        shape.draw();
    }
}
