package command_pattern;

/** 具体的命令类（B类），用于操控Receiver类，B类可以具体成某一个动作（对象）
 * Created by Niwa on 2017/8/7.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        //调用接收者的相关方法
        receiver.action();
    }
}
