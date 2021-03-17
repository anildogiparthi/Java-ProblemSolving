
package com.mywork.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian
{

    /**
     * 
     */
    public RunningMedian()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int length;
        TreeSet sorted = new TreeSet<Integer>();
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        while(length-- > 0)
        {
            int element=in.nextInt();
            sorted.add(element);
        }
        

    }

}
