package structure_pattern.adapter;

/**
 * 适配器模式-不兼容结构的协调
 * 就是封装了一种方法，而对外暴露出完全不一样的方法，本质上还是调用了被封装的方法
 *
 * 对象适配器、类适配器、双向适配器、缺省适配器
 *
 * Created by Suagr on 2017/8/16.
 */
public class Main {
    public static void main(String[] args){
        int[] arrays = {5,6,2,4,8,3,1,9,7,0};

        // 多态使用适配过后的类,通过读取配置文件反射生成实例对象
        Target target = (Target) XMLUtil.getBean();
        target.socreSort(arrays);

        for(int i=0;i<arrays.length;i++)
            System.out.print(arrays[i]+" ");

        System.out.println();
        System.out.println(target.socreSearch(arrays,11));
        System.out.println(target.socreSearch(arrays,0));
        System.out.println(target.socreSearch(arrays,55));
        System.out.println(target.socreSearch(arrays,6));
    }
}
