package structure_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 享元工厂类用于创建并管理享元对象，它针对抽象享元类编程，将各种类型的具体享元对象存储在一个享元池中，
 * 享元池一般设计为一个存储“键值对”的集合（也可以是其他类型的集合），可以结合工厂模式进行设计；当用户
 * 请求一个具体享元对象时，享元工厂提供一个存储在享元池中已创建的实例或者创建一个新的实例（如果不存在的话），
 * 返回新创建的实例并将其存储在享元池中。
 *
 * Created by Suagr on 2017/9/6.
 */
public class FlyweightFactory {
    private static FlyweightFactory instance = new FlyweightFactory();
    // 享元池，保存了享元对象，一般都是以HashMap的形式来存储对象
    private Map<String,Flyweight> flyweights;

    public FlyweightFactory(){
        this.flyweights = new HashMap<String,Flyweight>();
        flyweights.put("a",new ConcreteFlyweight("A Fly"));
        flyweights.put("b",new ConcreteFlyweight("B Fly"));
    }

    public static FlyweightFactory getInstance(){
        return instance;
    }

    /**
     *
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key){
        // 对象存在则直接获取
        if(flyweights.containsKey(key)){
            return flyweights.get(key);
        }else{
            // 对象不存在先创建
            Flyweight flyweight = new ConcreteFlyweight("new intrinsicState");
            flyweights.put(key,flyweight);
            return flyweight;
        }
    }
}
