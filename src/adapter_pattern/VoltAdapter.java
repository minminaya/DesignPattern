package adapter_pattern;

/** Adapter角色，将220v的电压装换成5v的电压
 * Created by Niwa on 2017/8/2.
 */
public class VoltAdapter extends Volt220 implements FiveVolt{

    @Override
    public int getVolt5() {
        return 5;
    }
}
