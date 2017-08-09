package decorator_pattern.example_one;

/** 抽象装饰者
 * Created by Niwa on 2017/8/8.
 */
public abstract class Decorator extends Component {
    //持有一个Component对象的引用
    private Component component;


    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
