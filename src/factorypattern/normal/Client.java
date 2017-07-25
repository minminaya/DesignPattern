package factorypattern.normal;

/** 客户类
 * Created by Niwa on 2017/7/22.
 */
public class Client {

    public static void main(String[] args){
        Factory factory = new ConcreteFactory();
        ConcreteProductA concreteProductA = (ConcreteProductA) factory.createProduct();
        concreteProductA.method();
    }
}
