package template_method_pattern;

/**
 * 军用的的计算机，相当于UML图中的ConcreteImplB
 * Created by Niwa on 2017/8/15.
 */
public class MilitaryComputer extends AbstractComputer {

    @Override
    protected void checkHardWare() {
        super.checkHardWare();
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("科学家进行指纹识别等复杂验证");
    }
}
