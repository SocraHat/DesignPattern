package structure_pattern.adapter;

/**
 * 适配器类，封装了适配者类的方法，对外提供一个符合目标要求的接口，但实际上操作的还是适配者adaptee中的方法
 * 有时需要继承目标类或者是实现目标类，目的是为了与目标类有一致的接口要求
 * Created by Suagr on 2017/8/16.
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(){
        super();
        this.adaptee = new Adaptee(); // 新建是配者对象，但是只在内部使用
        System.out.println(this.getClass().getName());
    }

    @Override public int[] socreSort(int[] arrays) {
        // 内部使用适配者的方法，对外暴露目标类想要的接口
        return this.adaptee.quickSort(arrays);
    }

    @Override public int socreSearch(int[] arrays, int key) {
        return this.adaptee.binarySearch(arrays,key);
    }
}
