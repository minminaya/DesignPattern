package template_method_pattern;

/**
 * 抽象的Computer，相当于UML图中的AbsTemplete
 * Created by Niwa on 2017/8/15.
 */
public class AbstractComputer {
    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardWare() {
        System.out.println("硬件检查");
    }

    protected void loadOs() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的系统不验证，直接登录系统");
    }

    /**
     * 启动计算机的方法，步骤固定为开启电源，硬件检查，加载操作系统，登录系统
     * <p>final方法，无法被重写了</p>
     */
    public final void startUp() {
        System.out.println("-----------关机START---------");

        powerOn();
        checkHardWare();
        loadOs();
        login();

        System.out.println("-------------关机END---------------");
    }
}
