package decorator_pattern.example_2;

/**
 * 抽象的装饰类，类似Decorator类
 * Created by Niwa on 2017/8/9.
 */
public abstract class PersonCloth extends Person {

    protected Person mPerson;//保持一个Person类的引用

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        //调用Person类中的dressed方法
        mPerson.dressed();
    }
}
