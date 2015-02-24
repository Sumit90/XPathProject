package com.practise.xmlparse.xpathproject;

import android.util.Log;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
/**
 * Created by e00959 on 2/23/2015.
 */

public class XmlParser {

    private DocumentBuilderFactory documentBuilderFactory;
    private DocumentBuilder documentBuilder;
    private Document document;
    private  XPath xPath;
    private String TAG="XmlParser";

//--------------------------------------------------------------------------------------------------
    public XmlParser(InputStream is) throws ParserConfigurationException,SAXException,IOException
    {
        documentBuilderFactory=DocumentBuilderFactory.newInstance();
        documentBuilder=documentBuilderFactory.newDocumentBuilder();
        document =documentBuilder.parse(is);
        xPath =  XPathFactory.newInstance().newXPath();

    }
 //--------------------------------------------------------------------------------------------------
    public Element parseRootElement()
    {
        Element element=document.getDocumentElement();
        return element;
    }

//--------------------------------------------------------------------------------------------------

    public Node getNode(String expression) throws XPathExpressionException
    {
        Log.d(TAG,"[getNode] :expression"+expression);
        Node node = (Node) xPath.compile(expression).evaluate(document, XPathConstants.NODE);
        return node;
    }
//--------------------------------------------------------------------------------------------------

    public NodeList getNodeList(String expression) throws XPathExpressionException
    {
        Log.d(TAG,"[getNodeList] :expression"+expression);
        NodeList nodeList = (NodeList)xPath.compile(expression).evaluate(document,XPathConstants.NODESET);
        return nodeList;
    }
}
