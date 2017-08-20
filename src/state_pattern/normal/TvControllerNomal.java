package state_pattern.normal;

/** 普通情况，if-else判断的
 * Created by Niwa on 2017/8/20.
 */
public class TvControllerNomal {
    /**
     * 关机状态标志
     */
    private final static int POWER_OFF = 2;
    /**
     * 开机状态标志
     */
    private final static int POWER_ON = 1;
    /**
     * 默认状态
     */
    private int mState = POWER_OFF;

    public void powerOn() {
        if (mState == POWER_OFF) {
            mState = POWER_ON;
            System.out.println("开机啦");
        }
    }

    public void powerOff() {
        if (mState == POWER_ON) {
            mState = POWER_OFF;
            System.out.println("关机啦");
        }
    }

    public void nextChannel() {
        if (mState == POWER_ON) {
            System.out.println("下一频道");
        }
    }
    public void preChannel() {
        if (mState == POWER_ON) {
            System.out.println("上一频道");
        }
    }
    public void turnUp() {
        if (mState == POWER_ON) {
            System.out.println("调高音量");
        }
    }


    public static void main(String[] args){
        TvControllerNomal mTvControllerNomal = new TvControllerNomal();
        mTvControllerNomal.powerOn();
        mTvControllerNomal.nextChannel();

        mTvControllerNomal.powerOff();
        mTvControllerNomal.nextChannel();
    }

}
