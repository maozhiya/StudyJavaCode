package Study.Day22;

/**
 * @author Li
 */

// public class Son extends Dad,Mom(){}

/*
    继承分为单继承和多重继承。
        单继承是指一个子类最多只能有一个父类。
        多继承是一个子类可以有二个以上的父类。
    由于多继承会带来二义性，Java语言中的类只支持单继承，而接口支持多继承。

    JAVA不支持多继承，单继承使JAVA的继承关系很简单，一个类只能有一个父类，易于管理程序，同时一个类可以实现多个接口，从而克服单继承的缺点。

* */

public class Son extends Dad{
    public void game() {
        System.out.println("儿子爱打游戏");
    }


    private void showOne() {
        System.out.println("Son private");
    }

    protected void showTwo() {
        System.out.println("Son protected");
    }

    void showThree() {
        System.out.println("Son 默认修饰符");
    }

    public void showFour() {
        System.out.println("Son public");
    }
}
