package decorator_pattern.example_2;

/** 昂贵的
 * 具体的装饰类，类似ConcreteDecoratorA
 * Created by Niwa on 2017/8/9.
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt() {
        System.out.println("装饰：穿上了短袖");
    }

    private void dressLeather() {
        System.out.println("装饰：穿上了皮衣");
    }

    private void dressJean() {
        System.out.println("装饰：穿上了牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
