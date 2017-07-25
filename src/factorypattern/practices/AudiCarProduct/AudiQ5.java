package factorypattern.practices.AudiCarProduct;

import factorypattern.practices.AudiCar;

/**
 * 奥迪汽车具体产品类Q5
 * Created by Niwa on 2017/7/25.
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5启动");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5开始自动导航");
    }
}
