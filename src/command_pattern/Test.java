package command_pattern;

/** 用户类
 * Created by Niwa on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        //构建接收者对象
        Receiver receiver = new Receiver();
        //根据接收者对象构造一个命令对象（）
        //关键在这里，具体的命令可以有很多种，比如每个命令类作为一个类，大大降低偶耦合
        Command command = new ConcreteCommand(receiver);
        //根据具体的对象构造请求者对象
        Invoker invoker = new Invoker(command);
        //执行请求方法
        invoker.startAction();
    }
}
