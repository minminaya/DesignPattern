package command_pattern;

/**
 * 抽象命令接口
 * Created by Niwa on 2017/8/7.
 */
public interface Command {
    /**
     * 执行具体命令逻辑的方法
     */
    void execute();
}
