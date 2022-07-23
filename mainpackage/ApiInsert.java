package mainpackage;

import java.io.BufferedInputStream;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ApiInsert {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			StringBuffer pharm_url = new StringBuffer();
			pharm_url.append("http://apis.data.go.kr/1613000/ExpBusInfoService/getStrtpntAlocFndExpbusInfo");
			pharm_url.append(
					"?serviceKey=서비스키를 입력하세요");

			URL url = new URL(pharm_url.toString());

			BufferedInputStream xmldata = new BufferedInputStream(url.openStream());

			Document document = builder.parse(xmldata);
			Element root = document.getDocumentElement();
			System.out.println(root.getTagName());
			NodeList list = root.getElementsByTagName("item");
			System.out.println(list.getLength());

			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				NodeList item_childlist = node.getChildNodes();
				for (int j = 0; j < item_childlist.getLength(); j++) {
					Node item_child = item_childlist.item(j);
					System.out.println(item_child.getNodeName() + " : " + item_child.getTextContent());
				}

				System.out.println();

//				ApiDAO dao = new ApiDAO();
//				dao.insertData(new API_VO(item_childlist.item(0).getTextContent(),
//						item_childlist.item(1).getTextContent(), item_childlist.item(2).getTextContent(),
//						item_childlist.item(3).getTextContent(), item_childlist.item(4).getTextContent(),
//						item_childlist.item(5).getTextContent(), item_childlist.item(6).getTextContent()));

			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

}
