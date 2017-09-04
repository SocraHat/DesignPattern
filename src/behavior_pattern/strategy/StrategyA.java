package behavior_pattern.strategy;

/**
 * Created by Suagr on 2017/8/15.
 */
public class StrategyA implements Strategy {

    @Override public void doStrategy() {
        System.out.println("this is strategy A");
    }
}
