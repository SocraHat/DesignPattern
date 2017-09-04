package structure_pattern.bridge;

/**
 * 另一个与业务关系较少的类的实现类，包含了一个内部的业务
 * 类似不同的颜料
 *
 * Created by Suagr on 2017/9/4.
 */
public class ImpleB implements Implementor{
    @Override public void innerOperator() {
        System.out.println("this is COLOR B!");
    }
}
