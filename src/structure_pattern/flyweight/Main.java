package structure_pattern.flyweight;

/**
 * 享元模式-实现对象的复用
 *
 * 享元模式以共享的方式高效地支持大量细粒度对象的重用，节省了内存资源。原因是引入了对象的内部状态和外部状态
 * 内部状态：存储在享元对象内部且不会随环境改变而改变的状态，内部状态可以共享
 * 外部状态：随环境改变而改变的、不可以共享的状态。享元对象的外部状态通常由客户端保存，并在
 *          享元对象被创建以后，需要使用时再传入到享元对象的内部，一个外部状态与另外的外部状态之间是相互独立的
 *
 * 正因为区分了内部状态和外部状态，我们可以将具有相同内部状态的对象存储在享元池中，享元池中的对象是可以实现共享的，
 * 需要的时候就将对象从享元池中取出，实现对象的复用。通过向取出的对象注入不同的外部状态，可以得到一系列相似的对象，而这些对象在内存中实际上只存储一份。
 *
 * Created by Suagr on 2017/9/5.
 */
public class Main {
    public static void main(String[] args){
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        Flyweight FA = flyweightFactory.getFlyweight("a");
        Flyweight FB = flyweightFactory.getFlyweight("b");
        Flyweight FC = flyweightFactory.getFlyweight("a");
        System.out.println("判断享元对象是否相同："+ (FA==FC)); // true

        FA.operate("FA");
        FB.operate("FB");
        FC.operate("FC");

    }
}
/*
* 1.与其他模式的联用
享元模式通常需要和其他模式一起联用，几种常见的联用方式如下：
(1)在享元模式的享元工厂类中通常提供一个静态的工厂方法用于返回享元对象，使用简单工厂模式来生成享元对象。
(2)在一个系统中，通常只有唯一一个享元工厂，因此可以使用单例模式进行享元工厂类的设计。
(3)享元模式可以结合组合模式形成复合享元模式，统一对多个享元对象设置外部状态。
2.享元模式与String类
JDK类库中的String类使用了享元模式。关于Java String类这种在修改享元对象时，先将原有对象复制一份，然后在新对象上再实施修改操作的机制称为“Copy On Write”。


* */
