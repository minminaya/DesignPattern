package factorypattern.normal;

/** 具体产品类B
 * Created by Niwa on 2017/7/22.
 */
public class ConcreteProductB extends Product{
    public ConcreteProductB() {
    }

    @Override
    public void method() {
        System.out.println("我是具体的产品类A");
    }
}
