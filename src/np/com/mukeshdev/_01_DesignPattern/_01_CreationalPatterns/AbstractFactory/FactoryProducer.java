package np.com.mukeshdev._01_DesignPattern._01_CreationalPatterns.AbstractFactory;

/**
 * Created by MM on 2017-06-14.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}