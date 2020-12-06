package Pro2.DrawGeometry.plan1;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtilFigure {
    public static String getBrandName() {
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = (Document) builder.parse(new File("src/Pro2/DrawGeometry/plan1/configFigure.xml"));

            NodeList nl = ((org.w3c.dom.Document) doc).getElementsByTagName("brandName");
            Node classNode = nl.item(0).getFirstChild();
            return classNode.getNodeValue().trim();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
