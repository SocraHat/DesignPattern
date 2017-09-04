package create_pattern.builder;

/**
 * 创建者模型-复杂对象的组装与创建
 * 用户类
 *
 * 直接与Diretor进行交互，避免了产品的实现过程与用户接触
 *
 * Created by Suagr on 2017/8/21.
 */
public class Main {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.getPartA()+" "+
                product.getPartB()+ " " +
        product.getPartC());
    }
}

/*
创建者模式
客户只需要创建指挥者，指挥者调用不同的具体创建者，创建者内容定义了不同组件的实现，指挥这还会定义组件的实现顺序，逐步创建复杂对象
然后将创建好的对象返回

缺省Director
钩子方法：精确的控制产品组件的创建过程
* */
