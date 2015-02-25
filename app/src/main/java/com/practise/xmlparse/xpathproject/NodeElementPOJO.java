package com.practise.xmlparse.xpathproject;

import org.w3c.dom.Node;

/**
 * Created by e00959 on 2/25/2015.
 */
public class NodeElementPOJO {

    private String keyChildName;
    private String keyChildValue;
    private String valueChildName;
    private String valueChildValue;
    private String parentReferenceAddress;
    private Node parentReferenceNode;
    private String elementType;
    private int modeOfComparison;

    NodeElementPOJO(String keyChildName,String keyChildValue,String valueChildName,String valueChildValue,
                    String parentReferenceAddress,Node parentReferenceNode,String nodeType,
                    int modeOfComparison)
    {
        this.keyChildName=keyChildName;
        this.keyChildValue=keyChildValue;
        this.valueChildName=valueChildName;
        this.valueChildValue=valueChildValue;
        this.parentReferenceAddress=parentReferenceAddress;
        this.parentReferenceNode=parentReferenceNode;
        this.elementType =nodeType;
        this.modeOfComparison=modeOfComparison;


    }

    public String getKeyChildName() {
        return keyChildName;
    }

    public void setKeyChildName(String keyChildName) {
        this.keyChildName = keyChildName;
    }

    public String getKeyChildValue() {
        return keyChildValue;
    }

    public void setKeyChildValue(String keyChildValue) {
        this.keyChildValue = keyChildValue;
    }

    public String getValueChildName() {
        return valueChildName;
    }

    public void setValueChildName(String valueChildName) {
        this.valueChildName = valueChildName;
    }

    public String getValueChildValue() {
        return valueChildValue;
    }

    public void setValueChildValue(String valueChildValue) {
        this.valueChildValue = valueChildValue;
    }

    public String getParentReferenceAddress() {
        return parentReferenceAddress;
    }

    public void setParentReferenceAddress(String parentReferenceAddress) {
        this.parentReferenceAddress = parentReferenceAddress;
    }

    public Node getParentReferenceNode() {
        return parentReferenceNode;
    }

    public void setParentReferenceNode(Node parentReferenceNode) {
        this.parentReferenceNode = parentReferenceNode;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public int getModeOfComparison() {
        return modeOfComparison;
    }

    public void setModeOfComparison(int modeOfComparison) {
        this.modeOfComparison = modeOfComparison;
    }
}
