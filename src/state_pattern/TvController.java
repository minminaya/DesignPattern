package state_pattern;

/** 电视遥控器，类似于经典状态模式中的Context
 * Created by Niwa on 2017/8/20.
 */
public class TvController implements PoweController {
    TvState mTvState;

    public void setmTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setmTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setmTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
