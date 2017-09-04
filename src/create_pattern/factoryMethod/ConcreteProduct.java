package create_pattern.factoryMethod;

/**
 * 具体商品类，具体实现了商品的动作
 *
 * Created by Suagr on 2017/8/17.
 */
public class ConcreteProduct implements Product{
    @Override public void display() {
        System.out.println("这是一个商品，由工厂方法生产的");
    }
}
