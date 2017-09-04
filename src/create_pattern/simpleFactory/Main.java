package create_pattern.simpleFactory;

/**
 * 简单工厂模式，不属于23个经典的设计模式
 *
 * 根据传入的参数不同，逻辑判断之后会生成对应的实例对象
 *
 * Created by Suagr on 2017/8/17.
 */
public class Main {
    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product productA = simpleFactory.getProduct("A");
        Product productB = simpleFactory.getProduct("B");

        productA.exit();
        productA.display();

        productB.exit();
        productB.display();
    }
}
