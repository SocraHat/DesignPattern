package structure_pattern.adapter;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * 为了具备良好的灵活性和可扩展性，通过读取xml配置文件的方法来实例化（反射）不同的实例
 *
 * Created by Suagr on 2017/8/16.
 */
public class XMLUtil {
    public static Object getBean(){
        Object obj = null;
        try{
            // 创建文档对象
            DocumentBuilderFactory documentBuildFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuildFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("src/structure_pattern/adapter/config.xml"));

            // 获取包含类名的文本节点
            NodeList nodeList = document.getElementsByTagName("className"); // 可以自定义标签
            Node classNode = nodeList.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            // 通过类名生成实例对象并返回
            Class clazz = Class.forName(className);
            obj = clazz.newInstance();
            return obj;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
