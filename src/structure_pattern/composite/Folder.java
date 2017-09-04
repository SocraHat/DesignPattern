package structure_pattern.composite;

import structure_pattern.bridge.Abstraction;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹，文件夹下可能还有文件夹，也可能拥有叶子文件
 *
 * Created by Suagr on 2017/9/4.
 */
public class Folder implements AbstractFile{
    private String fileName;
    private List<AbstractFile> abstractFileList = new ArrayList<AbstractFile>();

    public Folder(String name){
        this.fileName = name;
    }

    @Override public void add(AbstractFile abstractFile) {
        abstractFileList.add(abstractFile);
    }

    @Override public void remove(AbstractFile abstractFile) {
        abstractFileList.remove(abstractFile);
    }

    @Override public Abstraction getFile(int index) {
        return (Abstraction) abstractFileList.get(index);
    }

    @Override public void operate() {
        System.out.println(fileName+"该文件是文件夹，开始具体的业务操作，然后遍历该目录下的文件");
        // 遍历该目录下的所有文件
        for(AbstractFile abstractFile : abstractFileList){
            abstractFile.operate();
        }
    }
}
