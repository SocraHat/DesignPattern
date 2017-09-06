package behavior_pattern.chain_of_Responsibility;

/**
 * Created by Suagr on 2017/9/4.
 */
public abstract class Handler {
    // 维持向下传递的对象的引用
    protected Handler nextHandler;

    public void setHandler(Handler handler){
        this.nextHandler = handler;
    }

    /**
     * 根据传入参数的条件来判断当前对象能否处理或者是继续向下传递
     * @param condition
     */
    public abstract void operate(String condition);
}
