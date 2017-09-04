package create_pattern.prototype;

import org.junit.Test;

/**
 * Created by Suagr on 2017/8/21.
 */
public class ConcretePrototype implements Prototype,Cloneable{
    private String name;
    private int id;

    @Override public String getName() {
        return name;
    }

    @Override public void setName(String name) {
        this.name = name;
    }

    @Override public int getId() {
        return id;
    }

    @Override public void setId(int id) {
        this.id = id;
    }

    /**
     * 实现了Cloneable接口，重写clone方法实现深拷贝
     *
     * 深拷贝需要是不同的对象拥有相同的值，
     *
     * @return
     */
    @Override public Prototype clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (ConcretePrototype)obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test(){
        ConcretePrototype c = new ConcretePrototype();
        ConcretePrototype c2 = (ConcretePrototype) c.clone();
        System.out.println(c==c2); // false
    }
}
