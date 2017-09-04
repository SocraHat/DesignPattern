package behavior_pattern.strategy;

import java.sql.Connection;

/**
 *
 * 策略模式，根据不同的条件，调用不同的方法实现，但上层抽象时，一直是调用固定的一个策略方法，实现了算法的封装与切换
 * 重要的是两个类 Context环境类和Strategy抽象策略类
 * 根据传入的具体对象，调用实际的策略方法
 * Created by Suagr on 2017/8/15.
 */
public class Main {
    public static void main(String[] args){
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        Context context = new Context();
        // 传入实际操作的策略类
        context.setStrategy(strategyA);
        context.doAlgorithm();

        context.setStrategy(strategyB);
        context.doAlgorithm();
    }
}
