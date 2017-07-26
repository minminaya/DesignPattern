package observerpattern;

import java.util.Observable;

/**
 * DevTechFrontier这个网站是被观察者角色，当它的内容更新时，所有的观察者（程序员）都会收到相应的通知
 * Created by Niwa on 2017/7/26.
 */
public class DevTechFrontierObservable extends Observable {

    public void postNewPublication(String content) {
        setChanged();
        notifyObservers(content);
    }


}
