package Study.Day25;

/**
 * @author Li
 */

/*
    多态：
        同一个对象，在不同时刻表现出来的不同形态
        是同一个行为具有多个不同表现形式或形态的能力

    多态分为编译时多态和运行时多态
        编译时多态是静态的，主要是指方法的重载，它是根据参数列表的不同来区分不同的方法。通过编译之后会变成两个不同的方法，在运行时谈不上多态
        而运行时多态是动态的，它是通过动态绑定来实现的，也就是大家通常所说的多态性。

    举例：猫
        我们可以说猫是猫：猫 cat = new 猫();
        我们也可以说猫是动物：动物 animal = new 猫();
        这里猫在不同的时刻表现出来了不同的形态，这就是多态

    多态的前提和体现
        有继承/实现关系:在多态中必须存在有继承关系的子类和父类。
        有方法重写:子类对父类中某些方法进行重新定义，在调用这些方法时就会调用子类的方法。
        有父类引用指向子类对象:在多态中需要将子类的引用赋给父类对象，只有这样该引用才既能可以调用父类的方法，又能调用子类的方法。
 */

public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

        // 成员变量：编译看左边，运行看左边
        System.out.println("a.age:" + a.age);
        /* System.out.println("a.time:" + a.time); */

        // 成员方法：编译看左边，运行看右边
        a.eat();
        /* a.playGame */

        /*
        为什么成员变量和成员方法的访问不一样呢?
            因为成员方法有重写，而成员变量没有。
        * */
    }

    /*
         多态的优点
            1. 消除类型之间的耦合关系
            2. 可替换性
            3. 可扩充性
            4. 接口性
            5. 灵活性
            6. 简化性

        多态存在的三个必要条件
            继承
            重写
            父类引用指向子类对象

        多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
    * */
}