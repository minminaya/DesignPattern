package decorator_pattern.example_2;

/** Boy类，相当于具体实现类ConcreteComponent类
 * Created by Niwa on 2017/8/9.
 */
public class Boy extends Person {

    @Override
    public void dressed() {
        System.out.println("原始穿着：内衣内裤");
    }
}
