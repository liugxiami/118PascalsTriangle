package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<List<Integer>> result=generate(5);
    }
    //Given numRows,generate the first numRows of Pascal's Triangle.
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result=new ArrayList<>();
        if(numRows<=0) return null;

        if(numRows>=1){
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            result.add(list1);
        }

        if(numRows>=2){
            List<Integer> list2=new ArrayList<>();
            list2.add(1);
            list2.add(1);
            result.add(list2);
        }

        if(numRows>=3){
            for (int row = 2; row < numRows; row++) {
                List<Integer> temp=new ArrayList<>();
                List<Integer> prev=result.get(row-1);
                temp.add(1);
                for (int col = 1; col < row ; col++) {
                    temp.add(prev.get(col-1)+prev.get(col));
                }
                temp.add(1);
                result.add(temp);
            }
        }
        return result;
    }
}
