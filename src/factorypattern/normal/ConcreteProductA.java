package factorypattern.normal;

/** 具体产品类A
 * Created by Niwa on 2017/7/22.
 */
public class ConcreteProductA extends Product{
    public ConcreteProductA() {
    }

    @Override
    public void method() {
        System.out.println("我是具体的产品类A");
    }
}
