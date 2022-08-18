package com.mycompany.algorithm.tree;

public class BinaryTree {
    Node root;


    private Node addRecursive(Node current, int value)
    {
        if (current==null)
        {
            return new Node(value);
        }
        if(value<current.value)
        {
            current.left=addRecursive(current.left,value);
        }
        if(value>current.value)
        {
            current.left=addRecursive(current.right,value);
        }else
            {
                return current;
            }

        return current;
    }
    public void add(int value)
    {
        root = addRecursive(root,value);
    }
}
