package com.xmlparser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class Test {
	public static void main(String ss[]) throws IOException {
		
		//File xmlFile = new File("F:/xml/simple.xml");
		
		try {
			//URL url=new URL("http://assets-indiatoday.sportz.io/sifeeds/repo/cricket/live/json/calendar_new_liupre.json");
			URL url = new URL("http://indiatoday.intoday.in/rss/article.jsp?sid=146");
			URLConnection conn = url.openConnection();
			InputStream stream = conn.getInputStream();
			DocumentBuilderFactory factory  =  DocumentBuilderFactory.newInstance();
			DocumentBuilder builder1 = factory.newDocumentBuilder();
			org.w3c.dom.Document doc = builder1.parse(stream);
			System.out.println(doc);
			int i;
			while((i=stream.read())!=-1){
			//System.out.print((char)i);   
			
		//File xmlFile = new File("F:/xml/simple.xml");

	/*	try {
			Document document = builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			System.out.println(rootNode);
			List list = rootNode.getChildren("food");
		
			for(int i=0;i<list.size();i++){
				Element node  = (Element) list.get(i);
				
				System.out.print(node.getChildText("name"));
				System.out.print(" --- " + node.getChildText("price")); 
				System.out.print(" --- " + node.getChildText("description"));
				System.out.print(" --- " + node.getChildText("calories") + "\n"); 
			}

		} catch (Exception e) {
			System.out.println("Exception E: " + e);
		}*/
		}
		} catch (Exception e) {
		
			e.printStackTrace();
		}  
	}
}
