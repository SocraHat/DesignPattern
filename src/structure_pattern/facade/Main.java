package structure_pattern.facade;

/**
 * 外观模式-统一调用入口
 *
 * 它通过引入一个外观角色来简化客户端与子系统之间的交互，为复杂的子系统调用提供一个统一的入口，降低子系统与客户端的耦合度，且客户端调用非常方便。
 * 所有需要交互的类都被整合到这个外观类中，然后对外只需要访问这个外观类即可
 *
 * Created by Suagr on 2017/9/4.
 */
public class Main {
    public static void main(String[] args){
        // 整合了多种复杂业务对象
        EncryptFacade encryptFacade = new EncryptFacade();
        // 调用了业务对象的方法，但是不需要和复杂业务对象直接接触
        encryptFacade.operate();
    }
}
