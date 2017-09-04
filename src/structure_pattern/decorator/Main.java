package structure_pattern.decorator;

/**
 *
 * 装饰模式
 *
 * 可以在不改变一个对象的基本功能基础上给对象增加额外的新行为
 * 通过一种无须定义子类的方法来动态的给对象增加职责，使用对象之间的关联关系取代之间继承关系
 *
 *      抽象组件类、
 *      |       |
 * 具体组件类   抽象装饰类、
 *                |
 *             具体装饰类
 *
 * 装饰模式的核心就是抽象装饰类维护了一个抽象组件类的对象，方便在具体装饰类中调用原有业务的代码，增加额外的职责
 *  动态的拓展了一个对象的功能，降低了耦合性，但是会产生很多小对象
 *
 * Created by Suagr on 2017/8/16.
 */
public class Main {
    public static void main(String[] args){

        // 没有被装饰过的对象
        Component cc = new DecreteComponent();
        cc.operation();

        System.out.println();

        // 被装饰过的类
        Component component = new DecreteDecorator(new DecreteComponent());
        component.operation();
    }
}
