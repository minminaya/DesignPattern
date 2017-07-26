package observerpattern;

/** 客户端类
 * Created by Niwa on 2017/7/26.
 */
public class Client {

    public static void main(String[] arg) {
        //被观察者
        DevTechFrontierObservable devTechFrontier = new DevTechFrontierObservable();

        //观察者
        Coder coder1 = new Coder("john");
        Coder coder2 = new Coder("Marry");

        //注册观察者到可观察对象的观察者列表中（订阅）
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);

        //发布消息
        devTechFrontier.postNewPublication("我们网站有新的技术分享");
    }
}
