package create_pattern.abstractFactory;

/**
 * 抽象工厂模式 - 抽象工厂拥有创建多个不同对象的方法，同时因为工厂实例化时的多态，变允许存在更多的组合方法
 * 产品族：同一个工厂生产的不同的产品
 * 产品等级：相同类型产品的不同型号
 *
 * 重点是一个工厂中定义了多个生产产品的方法，省去了创建更多的产品与工厂的组合
 *
 * Created by Suagr on 2017/8/17.
 */
public class Main {
    public static void main(String[] args){
        AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractFactory factoryB = new ConcreteFactoryB();

        Product AA = factoryA.getProductA();
        AA.display();
        Product AB = factoryA.getProductB();
        AB.display();

        Product BA = factoryB.getProductA();
        BA.display();
        Product BB = factoryB.getProductB();
        BB.display();
    }
}
