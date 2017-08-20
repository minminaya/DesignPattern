package state_pattern;

/**
 * 电视状态接口，定义了电视操作的函数
 * Created by Niwa on 2017/8/20.
 */
public interface TvState {
    void nextChannel();

    void prevChannel();

    void turnUp();

    void turnDown();
}
