package behavior_pattern.strategy;

/**
 * 创建策略类的对象实例，并调用策略类的方法
 * 实质上还是传入了具体对象的实例
 *
 * Created by Suagr on 2017/8/15.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void doAlgorithm(){
        this.strategy.doStrategy();
    }
}
