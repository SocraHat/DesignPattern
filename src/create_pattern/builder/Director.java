package create_pattern.builder;

/**
 * 指挥类，负责安排复杂对象的构造次序，一般客户端直接与Director交互
 * 一是隔离了用户和产品的创建过程
 * 二是负责只会了产品的创建过程
 *
 * Created by Suagr on 2017/8/21.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    /**
     * 指定了组件的上产顺序，产品的组装顺序
     * @return
     */
    public Product construct(){
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
        return this.builder.getProduct();
    }
}
