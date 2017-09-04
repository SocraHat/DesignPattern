package structure_pattern.composite;

/**
 * 组合模式-树型结构的处理
 * 针对类似文件结构的树型结构提供良好的遍历、查询支持
 *
 * 文件夹中可能有文件夹和普通的文件，文件夹可能嵌套着不同的文件夹和文件，总体呈现出一种树状结构
 *
 * Created by Suagr on 2017/9/4.
 */
public class Main {
    public static void main(String[] args){
        // 针对抽象构件编程
        AbstractFile af1,af2,af3,af4,af5,af6,af7,af8;

        af1 = new Folder("文件夹1");
        af2 = new Folder("文件夹2");
        af3 = new Folder("文件夹3");

        af4 = new LeafFile("file4.jpg");
        af5 = new LeafFile("file5.png");
        af6 = new LeafFile("file6.rmvb");
        af7 = new LeafFile("file7.mp4");
        af8 = new LeafFile("file8.txt");

        // 组建文件结构
        af1.add(af2);
        af2.add(af4);
        af2.add(af5);
        af1.add(af6);
        af1.add(af3);
        af3.add(af7);
        af3.add(af8);

        // 遍历文件结构
        af1.operate();
        System.out.println();
        af2.operate();
    }
}
