package factorypattern.practices;

/**
 * 奥迪的抽象工厂类
 * Created by Niwa on 2017/7/25.
 */
public abstract class AudiFactory {
    /**
     * 这里的范型<T>指定很关键
     * 某车型的工厂方法，创建某车型对象
     *
     * @param clz 具体的suv 型号类型
     * @return 具体型号的suv车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
