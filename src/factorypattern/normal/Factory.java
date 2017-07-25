package factorypattern.normal;

/**
 * 抽象工厂类
 * Created by Niwa on 2017/7/22.
 */
public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生成什么由子类去实现
     *
     * @return 具体的产品类
     */
    public abstract Product createProduct();
}
