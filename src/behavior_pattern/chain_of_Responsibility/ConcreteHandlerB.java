package behavior_pattern.chain_of_Responsibility;

/**
 * Created by Suagr on 2017/9/4.
 */
public class ConcreteHandlerB extends Handler {
    @Override public void operate(String condition) {
        if(condition.equalsIgnoreCase("conditionB")){
            System.out.println("this is HandlerB, it will be B\n");
        } else {
            System.out.println("sorry, B can't handler, transt");
            this.nextHandler.operate(condition);
        }
    }
}
