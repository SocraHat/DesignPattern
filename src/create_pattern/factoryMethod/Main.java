package create_pattern.factoryMethod;

/**
 * 工厂方法模式也叫工厂模式-具体的类的创建由具体的工厂去创建
 * 需要什么样的商品就创建什么样的工厂
 *
 * Created by Suagr on 2017/8/17.
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.display();
    }
}
