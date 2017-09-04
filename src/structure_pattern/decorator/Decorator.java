package structure_pattern.decorator;

/**
 * 抽象装饰类
 *
 * 该类是核心，它维护了一个抽象组件类的对象，方便调用它的业务代码，
 * 然后由子类具体装饰类重新加上新的实现，完成了动态增加职责
 *
 * Created by Suagr on 2017/8/17.
 */
public abstract class Decorator implements Component{

    Component component;

    /**
     * 维护了一个抽象组件类对象，方便调用原来的业务代码，然后由具体装饰类去动态拓展
     * @param component
     */
    public Decorator(Component component){
        this.component = component;
    }

    /**
     * 调用抽象组件的代码，但是并没有进行装饰，由具体的装饰子类去实现，这里只是提出了规范
     */
    @Override public abstract void operation();
}
