package structure_pattern.bridge;

/**
 * 具体要进行的业务代码与之关系最为密切的这个类当作抽象类（一般不是interface而是abstract），包含了另一个维度的对象，方便进行回调
 *
 * 比如作画时的画笔
 * Created by Suagr on 2017/9/4.
 */
public abstract class Abstraction {
    Implementor implementor;

    /**
     * 持有“实现类”的对象
     * @param implementor
     */
    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    // 声明具体业务的抽象方法
    public abstract void operator();
}
