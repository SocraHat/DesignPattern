package behavior_pattern.chain_of_Responsibility;

/**
 * 职责链模式-请求的链式处理
 * 对于一个对象来说，处理不了的请求就交给下一链的对象来处理，如果仍然处理不了，则继续向下传递；可以自行设置不同的负责人
 *
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。职责链模式是一种对象行为型模式。
 *
 * Created by Suagr on 2017/9/4.
         */
public class Main {
    public static void main(String[] args){
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        // 开始对不同的handler设置下一链对象，手动拼装责任链，更加灵活，因地制宜
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        // 处理条件A
        handlerA.operate("conditionA");
        // 处理条件C
        handlerA.operate("conditionC");
        // 处理条件D
        handlerA.operate("conditionD");
    }
}
