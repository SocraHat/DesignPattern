package structure_pattern.bridge;

/**
 * 实现了抽象类，完善了具体的业务操作
 * 类似不同型号的笔
 *
 * Created by Suagr on 2017/9/4.
 */
public class AbstractImpleB extends Abstraction{
    @Override public void operator() {
        this.implementor.innerOperator();
        System.out.println("内部的逻辑已经实现完毕，现在实现的是B外部的主要业务逻辑");
    }
}
