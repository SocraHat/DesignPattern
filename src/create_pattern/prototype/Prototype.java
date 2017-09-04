package create_pattern.prototype;

/**
 * 原型模式
 *
 * 借用Java中的深拷贝来实现，实现Cloneable接口重写clone方法
 *
 * Created by Suagr on 2017/8/21.
 */
public interface Prototype extends Cloneable{
    Prototype clone();
    void setName(String Name);
    String getName();
    void setId(int id);
    int getId();
}
