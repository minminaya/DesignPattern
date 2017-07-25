package factorypattern.practices.AudiCarProduct;

import factorypattern.practices.AudiCar;

/**
 * 奥迪汽车具体产品类Q7
 * Created by Niwa on 2017/7/25.
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7启动");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7开始自动导航");
    }
}
