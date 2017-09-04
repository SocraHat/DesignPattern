package create_pattern.factoryMethod;

/**
 * 工厂类接口，规范了创建对象的方法
 *
 * Created by Suagr on 2017/8/17.
 */
public interface Factory {
    Product getProduct();
    Product factoryMethod();
}
