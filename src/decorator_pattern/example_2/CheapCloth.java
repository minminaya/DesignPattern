package decorator_pattern.example_2;

/** 便宜的
 * 具体的装饰类，类似ConcreteDecoratorA
 * Created by Niwa on 2017/8/9.
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShorts() {
        System.out.println("装饰：穿上了短裤");
    }


    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
