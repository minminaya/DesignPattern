package strategy_pattern;

/**
 * 地铁价格的计算策略
 * Created by Niwa on 2017/7/29.
 */
public class SubwayStrategy implements CalculateStrategy {

    /**
     * 按距离来计算价格
     * (0,6]公里3元，(6,12]公里4元,(12,22]公里5元，(22,32]公里6元
     *
     * @param km 公里
     * @return 返回价格
     */
    @Override
    public int calculatePrice(int km) {
        if (km <= 6 && km > 0) {
            return 3;
        }else if(km > 6 && km <= 12){
            return 4;
        } else if(km > 12 && km <= 22){
            return 5;
        } else if(km > 22 && km <= 32){
            return 6;
        }
        //大于32km
        return 7;
    }
}
