package facade_pattern;

/** 子系统1实现类
 * Created by Niwa on 2017/8/11.
 */
public class PhoneImpl implements Phone {

    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");

    }
}
