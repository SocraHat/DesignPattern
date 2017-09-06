package behavior_pattern.chain_of_Responsibility;

/**
 * Created by Suagr on 2017/9/4.
 */
public class ConcreteHandlerA extends Handler {
    @Override public void operate(String condition) {
        if(condition.equalsIgnoreCase("conditionA")){
            System.out.println("this is HandlerA, it will be A\n");
        } else {
            System.out.println("sorry, A can't handler, transt");
            this.nextHandler.operate(condition);
        }
    }
}
