package template_method_pattern;

/**
 * 程序员的计算机，相当于UML图中的ConcreteImplA
 * Created by Niwa on 2017/8/15.
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("coder只需要进行用户和密码验证就可以了");
    }
}
