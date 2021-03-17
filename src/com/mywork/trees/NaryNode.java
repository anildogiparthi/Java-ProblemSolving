package com.mywork.trees;

import java.util.HashMap;

public class NaryNode
{
    public int value;

    public  HashMap<Integer, NaryNode> children;

    public NaryNode(int value)
    {
        this.value = value;
        this.children = new HashMap<Integer, NaryNode>();
    }
}
