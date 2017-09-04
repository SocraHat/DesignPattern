package structure_pattern.decorator;

/**
 * 具体装饰类
 *
 * Created by Suagr on 2017/8/17.
 */
public class DecreteDecorator extends Decorator{

    /**
     * 维护了一个抽象组件类对象，方便调用原来的业务代码，然后由具体装饰类去动态拓展
     *
     * @param component
     */
    public DecreteDecorator(Component component) {
        super(component);
    }

    @Override public void operation(){
        super.component.operation();
        System.out.println("这里是具体装饰类，已经对维护的抽象组件类装饰过了");
    }
}
