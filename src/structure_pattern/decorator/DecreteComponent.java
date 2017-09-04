package structure_pattern.decorator;

/**
 * 具体组件类
 * Created by Suagr on 2017/8/17.
 */
public class DecreteComponent implements Component{

    @Override public void operation() {
        System.out.println("这里是具体组件类，但是没有被装饰过");
    }
}
