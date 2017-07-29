package strategy_pattern;

/** 测试类
 * Created by Niwa on 2017/7/29.
 */
public class Client {
    //声明接口
    CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int calculatePrice(int km) {
        return calculateStrategy.calculatePrice(km);
    }

    public static void main(String[] args) {
        Client client = new Client();
        //注入
        client.setCalculateStrategy(new SubwayStrategy());
        System.out.println("价格是：" + client.calculatePrice(32));
    }
}
