package factorypattern.practices;

import factorypattern.practices.AudiCarProduct.AudiQ5;
import factorypattern.practices.AudiCarProduct.AudiQ7;

/** 客户端
 * Created by Niwa on 2017/7/25.
 */
public class client {
    public static void main(String[] a){
        //构造一个制造汽车的工厂对象
        AudiCarFactory audiCarFactory = new AudiCarFactory();

        //生产Q5
        AudiQ5 audiQ5 = audiCarFactory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();

        //生产Q7
        AudiQ7 audiQ7 = audiCarFactory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();

    }
}
