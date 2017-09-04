package structure_pattern.composite;

import structure_pattern.bridge.Abstraction;

/**
 * 叶子文件，不具备文件夹的属性
 *
 * Created by Suagr on 2017/9/4.
 */
public class LeafFile implements AbstractFile{
    private String fileName;

    public LeafFile(String name){
        this.fileName = name;
    }

    @Override public void add(AbstractFile abstractFile) {
        System.out.println("不支持添加文件");
    }

    @Override public void remove(AbstractFile abstractFile) {
        System.out.println("不支持移除文件");
    }

    @Override public Abstraction getFile(int index) {
        return null;
    }

    @Override public void operate() {
        System.out.println(fileName+"该文件是叶子文件，这里是开始具体的业务操作");
    }
}
