/**
 * 测试char能否表示汉字
 * Created by Suagr on 2017/8/15.
 */
public class Test {

    @org.junit.Test
    public void testUnicode(){
        System.out.println(System.getProperty("file.encoding"));
        char c = '脏';
        String str = String.valueOf(c);
        System.out.println(c&0xFFFFFF);
        System.out.println(str.getBytes().length);
    }
    /**
     * Java的源码使用的是内码Unicode，可以用两个字节表示汉字，但无法表示全部的汉字
     * 我们使用的编码或者是改变的编码是外码，可以由unicode来进行转换
     *
     * unicode下汉字是2个字节，utf-8是3个字节，utf-16是2个字节
     */
}
