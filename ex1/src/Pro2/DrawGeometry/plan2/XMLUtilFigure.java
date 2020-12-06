package Pro2.DrawGeometry.plan2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilFigure {

    public static Object getBean() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = (Document) builder.parse(new File("src/Pro2/DrawGeometry/plan2/configFigure.xml"));

            NodeList nl = ((Document) doc).getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            // System.out.println(cName);

            Class c = Class.forName("Pro2.DrawGeometry.plan2."+cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
