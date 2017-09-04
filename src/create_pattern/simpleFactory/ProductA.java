package create_pattern.simpleFactory;

/**
 * 具体的商品类
 *
 * Created by Suagr on 2017/8/17.
 */
public class ProductA extends Product{

    @Override public void display() {
        super.display();
        System.out.println("这是商品A的展示");
    }
}
