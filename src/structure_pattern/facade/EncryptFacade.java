package structure_pattern.facade;

/**
 * Created by Suagr on 2017/9/4.
 */
public class EncryptFacade {
    // 作为表面类，要持有真正业务类的对象
    private OperatorA operatorA = new OperatorA();
    private OperatorB operatorB = new OperatorB();
    private OperatorC operatorC = new OperatorC();

    public void operate(){
        this.operatorA.operateA();
        this.operatorB.operateB();
        this.operatorC.operateC();
    }
}
