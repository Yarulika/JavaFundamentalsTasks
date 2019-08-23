package com.points.collinear;

public class Application {

    public static void main(String[] args){
        // get input data from the keyboard

        int[] testCollection = new int[]{1,2,3,4,5,6};

        Points k = new Points(testCollection[0],testCollection[1],testCollection[2],testCollection[3],testCollection[4],testCollection[5]);

        System.out.println(k.isCollinear());
    }
}
