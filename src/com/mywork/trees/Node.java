package com.mywork.trees;

public class Node
{
    public int value;
    public Node left;
    public Node right;
    public int hd;
    public Node(int value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
        this.hd = Integer.MAX_VALUE;
    }
    public Node()
    {
        // TODO Auto-generated constructor stub
    }   
}
