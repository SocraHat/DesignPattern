package create_pattern.builder;

/**
 * 具体构造者，实现了各组件的具体实现方法，以及提供方法返回一个组装好的复杂组件对象
 *
 * Created by Suagr on 2017/8/21.
 */
public class ConcreteBuilder extends Builder{
    @Override public void buildPartA() {
        this.product.setPartA("this is A");
    }

    @Override public void buildPartB() {
        this.product.setPartB("this is B");
    }

    @Override public void buildPartC() {
        this.product.setPartC("this is C");
    }
}
