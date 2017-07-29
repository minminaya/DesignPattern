package strategy_pattern;

/**
 * 计算接口
 * Created by Niwa on 2017/7/29.
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     *
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
