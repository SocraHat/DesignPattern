package create_pattern.singleton;

/**
 * Created by Suagr on 2017/5/11.
 * 单例方法：
 * 使用内置的获取对象的方法来回去单例对象
 *
 * 但是在并发的情况下，如果创建对象初始化需要一段较长的时间，就会有多个线程进入创建实例，从而造成了多实例
 *
 * 饿汉单例模式：类定义静态的单例对象，在类加载的时候，该单例就已经初始化
 * 懒汉单例模式：使用sychronized同步关键字来实例化单例，但需要双重检查锁定，即进入同步区后再次判断对象是否为null
 *
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("这里是隐藏的私有构造函数");
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args){
        // 普通单例模式
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing1==sing2);
        System.out.println(sing1.hashCode());
        System.out.println(sing2.hashCode());

        // 饿汉单例模式

        // 懒汉单例模式

    }
}

/**
 * 饿汉式单例
 */
class SingletonEHan{
    // 设置静态单例对象，类在加载的时候就已经初始化完毕
    private static final SingletonEHan singletonEHan = new SingletonEHan();

    public static SingletonEHan getInstance(){
        return singletonEHan;
    }
}

/**
 * 懒汉式单例
 * 双重检查锁定
 */
class SingletonLanhan{
    // 单例对象要设置为volatile对线程可见
    private volatile static SingletonLanhan singletonLanhan = null;

    public static SingletonLanhan getInstance(){
        // 第一次检查判断
        if(singletonLanhan==null){
            // 锁定代码块
            synchronized (singletonLanhan){
                // 第二次检查判断
                if(singletonLanhan==null)
                    singletonLanhan = new SingletonLanhan();
            }
        }
        return singletonLanhan;
    }
}
