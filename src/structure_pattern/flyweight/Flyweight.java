package structure_pattern.flyweight;

/**
 * 享元抽象类
 * 通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公共的方法，这些方法可以向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部状态）。
 *
 * Created by Suagr on 2017/9/6.
 */
public abstract class Flyweight {
    // 内部状态通常被设置为成员变量，同一个享元对象内部状态是一致的
    private String intrinsicState;

    public Flyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    public String getIntrinsicState(){
        return this.intrinsicState;
    }

    // 外部状态在使用时由外部设置，不保存在享元对象中，即使是同一个对象，在每一次调用时也可以传入不同的外部状态，然后组成不同的“对象”
    public abstract void operate(String extrinsicState);
}
