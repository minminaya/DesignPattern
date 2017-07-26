package observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者实现类
 * 程序员是观察者
 * Created by Niwa on 2017/7/26.
 */
public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi，" + name + ",DevTechFrontier：" + arg);
    }

    @Override
    public String toString() {
        return "程序员名字：" + name;
    }
}
