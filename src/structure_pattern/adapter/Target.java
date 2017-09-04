package structure_pattern.adapter;

/**
 * 目标接口类，这里规定了想要调用的方法(参数、返回值等都是条件)，由Adapter具体实现并提供
 *
 * Created by Suagr on 2017/8/16.
 */
public interface Target {
    // 对成绩进行排序
    public int[] socreSort(int[] arrays);

    // 对成绩进行查询
    public int socreSearch(int[] arrays,int key);
}
