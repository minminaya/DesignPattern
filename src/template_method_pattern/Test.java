package template_method_pattern;

/** 测试类
 * Created by Niwa on 2017/8/15.
 */
public class Test {

    public static void main(String[] args){
        AbstractComputer computer = new AbstractComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
