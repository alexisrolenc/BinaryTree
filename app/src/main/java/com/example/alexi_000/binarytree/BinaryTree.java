package com.example.alexi_000.binarytree;

/**
 * Created by alexi_000 on 4/6/2017.
 */

public class BinaryTree
{
    private int payload;
    private String lAddress;
    private BinaryTree leftT;
    private BinaryTree rightT;

    public BinaryTree(int payload)
    {
        this.payload = payload;
        this.leftT = null;
        this.rightT = null;
    }

    public int addBinaryTree(int payload)
    {
        BinaryTree addTree = new BinaryTree(payload);
        if (payload > this.payload)
        {
            if(this.rightT == null)
            {
                this.rightT = addTree;
                return this.payload;
            }
            return this.rightT.addBinaryTree(payload);
        }
        else if (payload <= this.payload)
        {
            if(this.leftT == null)
            {
                this.leftT = addTree;
                return this.payload;
            }
            return this.leftT.addBinaryTree(payload);
        }
        return this.payload;
    }
}
