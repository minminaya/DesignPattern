package strategy_pattern;

/**
 * 公交车价格计算策略
 * Created by Niwa on 2017/7/29.
 */
public class BusStrategy implements CalculateStrategy {

    /**
     * 北京公交车，十公里之内1元，超过十公里之后每加一元可以乘车5公里
     *
     * @param km 公里
     * @return 返回最终的费用
     */
    @Override
    public int calculatePrice(int km) {
        //具体的算法逻辑
        int extraTotal = km - 10;
        int extraFactor = km / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
