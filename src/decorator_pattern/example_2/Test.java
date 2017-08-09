package decorator_pattern.example_2;

/** 测试类
 * Created by Niwa on 2017/8/9.
 */
public class Test {
    public static void main(String[] args){
        //首先要有一个Person男孩
        Person person = new Boy();
        //然后为他穿上便宜的衣服
        PersonCloth cheapCloth = new CheapCloth(person);
        cheapCloth.dressed();

        System.out.println();
        System.out.println();
        System.out.println();
        //或者穿上贵的衣服
        PersonCloth expensiveCloth = new ExpensiveCloth(person);
        expensiveCloth.dressed();


    }
}
