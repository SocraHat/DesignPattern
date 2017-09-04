package create_pattern.simpleFactory;

/**
 * 简单工厂方法，根据传入的值进行逻辑判断，生成不同的对象
 *
 * Created by Suagr on 2017/8/17.
 */
public class SimpleFactory {
    Product product;

    /**
     * 进行逻辑判断
     * @param choose
     * @return
     */
    public Product getProduct(String choose){
        if(choose.equalsIgnoreCase("A")){
            this.product = new ProductA();
        } else if(choose.equalsIgnoreCase("B")){
            this.product = new ProductB();
        }
        return this.product;
    }
}
