package decorator_pattern.example_one;

/**
 * Created by Niwa on 2017/8/8.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
    }
    /**
     *  自定义的装饰方法A
     * */
    public void operateA() {
        //装饰方法逻辑
    }

    /**
     * 自定义的装饰方法B
     * */
    public void operateB() {
        //装饰方法逻辑
    }
}
