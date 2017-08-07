package command_pattern;

/** 请求者类（A类）
 * Created by Niwa on 2017/8/7.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    /**
     *  请求者类的开始活动方法，用于调用B类来控制C
     * */
    public void startAction(){
        //调用具体命令对象的相关方法，执行具体命令
        command.execute();
    }
}
