package create_pattern.simpleFactory;

/**
 * Created by Suagr on 2017/8/17.
 */
public class ProductB extends Product{
    @Override public void display() {
        super.display();
        System.out.println("这是商品B的展示");
    }
}
