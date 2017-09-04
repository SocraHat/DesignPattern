package create_pattern.singleton;

/**
 * Initialization Demand Holder (IoDH)的技术，实现了延迟加载与线程安全
 * 结合了饿汉和懒汉加载
 *
 * Created by Suagr on 2017/8/17.
 */
public class IoDHSingleton {

    /**
     * 定义静态内部类来实例化单例对象，因为在主体类中没有定义该单例对象，所以并不会在加载时初始化，实现了延迟加载
     * 而静态对象实现了单例
     */
    private static class HolderClass{
        private final static IoDHSingleton singleton = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(){
        return HolderClass.singleton;
    }

    public static void main(String[] args){
        IoDHSingleton single1 = IoDHSingleton.getInstance();
        IoDHSingleton single2 = IoDHSingleton.getInstance();
        System.out.println(single1==single2);
    }
}
