package structure_pattern.bridge;

/**
 * 桥接模式-处理多维度变化
 * 将两个或多个属性解耦，不同的属性便有了更好的扩展性，根据具体情况再具体装配属性组合，更加符合单一职责原则
 *
 * 它将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层建立一个抽象关联，该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式。
 * 将抽象部分与实现部分分离，使每个部分都可以独立的变化，是一种良好的多重继承的改良模式
 * 一般将具有两个独立变化维度的类的一些普通业务方法和与之关系最密切的维度设计为“抽象类”层次结构（抽象部分），而将另一个维度设计为“实现类”层次结构（实现部分）。
 *
 * Created by Suagr on 2017/9/4.
 */
public class Main {
    public static void main(String[] args){
        // 有两个实现的抽象类，有两个实现的实现类，这里会进行不同的搭配
        Abstraction abstractionA = new AbstractImpleA();
        Abstraction abstractionB = new AbstractImpleB();
        // A+A
        abstractionA.setImplementor(new ImpleA());
        // A+B
        abstractionB.setImplementor(new ImpleB());
        // 开始具体的业务执行
        abstractionA.operator();
        abstractionB.operator();
        System.out.println();

        // A+B
        abstractionA.setImplementor(new ImpleB());
        // B+A
        abstractionB.setImplementor(new ImpleA());
        abstractionA.operator();
        abstractionB.operator();
    }
}
/*
* 这样设计更具备扩展性，无论是增加新的“抽象类”实现还是增加新的“实现类”实现，都只需要增加各自的实现类即可
*
* 和适配器模式还是不同的：
* 桥接模式和适配器模式用于设计的不同阶段，桥接模式用于系统的初步设计，对于存在两个独立变化维度的类可以将其分为
* 抽象化和实现化两个角色，使它们可以分别进行变化；而在初步设计完成之后，当发现系统与已有类无法协同工作时，可以
* 采用适配器模式。但有时候在设计初期也需要考虑适配器模式，特别是那些涉及到大量第三方应用接口的情况。
* */
