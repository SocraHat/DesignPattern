package create_pattern.builder;

/**
 * 抽象构造者，为创建一个产品的组件生产方法做出定义，并定义返回复杂对象的方法
 * Created by Suagr on 2017/8/21.
 */
public abstract class Builder {
    Product product = new Product();

    public void buildPartA(){}
    public void buildPartB(){}
    public void buildPartC(){}

    public Product getProduct(){
        return this.product;
    }
}
