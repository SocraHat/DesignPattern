package create_pattern.simpleFactory;

/**
 * 抽象商品类，只有最为基本的属性，拓展属性由不同的具体商品进行实现补充
 *
 * Created by Suagr on 2017/8/17.
 */
public abstract class Product {

    public void display(){}

    public void exit(){
        System.out.println("每一个商品都是来自同一个场");
    }
}
