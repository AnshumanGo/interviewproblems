package com.problems.java;

class NodeData {
    int data ;
    NodeData leftNode, rightNode;

    public NodeData(int dataValue){
        data = dataValue;
        leftNode = rightNode = null;
    }
}



public class BST {

    static NodeData insert(NodeData rootNode, int dataValue) {
        if (rootNode == null) {
            return new NodeData(dataValue);
        }

        if (rootNode.data == dataValue)
            return rootNode;

        if (dataValue < rootNode.data)
            rootNode.leftNode = insert(rootNode.leftNode, dataValue);

        else
            rootNode.rightNode = insert(rootNode.rightNode, dataValue);


        return rootNode;

    }
}


