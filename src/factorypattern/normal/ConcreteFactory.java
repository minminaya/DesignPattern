package factorypattern.normal;

/** 具体的工厂类
 * Created by Niwa on 2017/7/22.
 */
public class ConcreteFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
