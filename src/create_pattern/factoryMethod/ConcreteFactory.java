package create_pattern.factoryMethod;

/**
 * 具体工厂，具体实现了工厂生产对象的方式
 *
 * Created by Suagr on 2017/8/17.
 */
public class ConcreteFactory implements Factory{

    Product product;

    @Override public Product getProduct(){
        return this.product = new ConcreteProduct();
    }

    @Override public Product factoryMethod() {
        return getProduct();
    }
}
