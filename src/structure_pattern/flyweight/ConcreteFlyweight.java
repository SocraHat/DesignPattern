package structure_pattern.flyweight;

/**
 * 具体享元对象
 * 实现了抽象享元类，其实例称为享元对象；在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 *
 * Created by Suagr on 2017/9/6.
 */
public class ConcreteFlyweight extends Flyweight{

    public ConcreteFlyweight(String intrinsicState) {
        super(intrinsicState);
    }

    @Override public void operate(String extrinsicState) {
        System.out.println("extrinsic: "+extrinsicState + " and intrinsicState: "+this.getIntrinsicState());
    }
}
