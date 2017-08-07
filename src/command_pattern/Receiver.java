package command_pattern;

/**
 * 接收者类，(类C)
 * Created by Niwa on 2017/8/7.
 */
public class Receiver {
    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action() {
        System.out.println("执行具体操作");
    }
}
