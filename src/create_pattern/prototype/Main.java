package create_pattern.prototype;

/**
 * 原型模式利用了Java中的clone原理
 * 克隆的概念：不同对象拥有相同的值
 * 浅克隆与深克隆的区别就是：是否支持非基本数据类型（引用对象的）复制
 *
 * 浅克隆对于基本数据类型会赋值值；非基本数据类型会只复制一个引用；
 * 深克隆对于基本数据类型和非基本数据类型都会复制一个值，多个克隆对象的值修改互不干扰
 *
 * 深克隆可以使用序列化实现，将对象读取到流中再从流中读取出来
 * Created by Suagr on 2017/8/21.
 */
public class Main {
    public static void main(String[] args){
        Prototype p1 = new ConcretePrototype();
        p1.setName("socra");
        p1.setId(233);
        Prototype p2 = p1.clone();

        System.out.println(p1==p2);
        System.out.println(p1.getName()==p2.getName());
        System.out.println(p1.getId()==p2.getId());
    }
}
