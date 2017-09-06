package behavior_pattern.chain_of_Responsibility;

/**
 * Created by Suagr on 2017/9/4.
 */
public class ConcreteHandlerC extends Handler {
    @Override public void operate(String condition) {
        if(condition.equalsIgnoreCase("conditionC")){
            System.out.println("this is HandlerC, it will be C\n");
        } else {
            System.out.println("sorry, nobody can handler this");
        }
    }
}
