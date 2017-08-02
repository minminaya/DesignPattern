package adapter_pattern;

/** 测试类
 * Created by Niwa on 2017/8/2.
 */
public class Client {

    public static void main(String[] args){
        VoltAdapter voltAdapter = new VoltAdapter();
        System.out.println("输出电压：" + voltAdapter.getVolt5());
    }
}
