package create_pattern.abstractFactory;

/**
 * 抽象工厂，定义了多个创建对象的方法，可以创建多个不同的对象
 *
 * Created by Suagr on 2017/8/17.
 */
public interface AbstractFactory {
    Product getProductA();
    Product getProductB();
}
