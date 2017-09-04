package structure_pattern.bridge;

/**
 * 两个维度中与具体的业务代码关系较少的类
 * 比如作画时的颜料盒
 *
 * Created by Suagr on 2017/9/4.
 */
public interface Implementor {
    public void innerOperator();
}
