package structure_pattern.composite;

import structure_pattern.bridge.Abstraction;

/**
 * 抽象文件类，为叶子文件和文件夹提供抽象
 *
 * Created by Suagr on 2017/9/4.
 */
public interface AbstractFile {
    void add(AbstractFile abstractFile);
    void remove(AbstractFile abstractFile);
    Abstraction getFile(int index);
    void operate();
}
