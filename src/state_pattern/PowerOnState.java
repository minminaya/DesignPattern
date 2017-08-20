package state_pattern;

/** 关机状态
 * Created by Niwa on 2017/8/20.
 */
public class PowerOnState implements TvState{
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("音量加");
    }

    @Override
    public void turnDown() {
        System.out.println("音量剪");
    }
}
