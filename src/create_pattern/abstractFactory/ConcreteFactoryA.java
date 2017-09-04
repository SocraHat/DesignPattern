package create_pattern.abstractFactory;

/**
 * 生产A、B类产品的工厂，具有多个生产不同产品的方法
 *
 * Created by Suagr on 2017/8/17.
 */
public class ConcreteFactoryA implements AbstractFactory {

    @Override public Product getProductA() {
        System.out.print("这里是A工厂进行生产，");
        return new ConcreteProductA();
    }

    @Override public Product getProductB() {
        System.out.print("这里是A工厂进行生产，");
        return new ConcreteProductB();
    }
}
