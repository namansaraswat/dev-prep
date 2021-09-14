package com.prep.collection.sorting;

import java.util.Comparator;
import java.util.TreeSet;

// Program to insert Integer object in Treeset in descending order

public class TreesetSorting {

    public static void main(String args[]){

        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(20);

        System.out.println(treeSet);
    }

    static class MyComparator implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {

            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;

            if(i1<i2)
                return 1;
            else if(i1>i2)
                return -1;
            else
                return 0;
        }
    }
}
