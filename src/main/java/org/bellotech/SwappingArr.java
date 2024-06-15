package org.bellotech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwappingArr {

    public static void main(String[] args) {

//        int [] arr = {2,3,5,6,7,8};
//
//         swapp(arr, 2, 4);
//        System.out.println(Arrays.toString(arr));

        String [] names = {"Marzuqoh","Abisola","Akanke","Opeyemi"};

        swapp(names,0,3);
        System.out.println(Arrays.toString(names));
    }

    public static void swapp(String [] names, int index1,int index2){

        String temp = names[index1];
        names[index1] = names[index2];
        names[index2] = temp;

    }
}
