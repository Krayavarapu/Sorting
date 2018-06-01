package code;

import java.util.ArrayList;

public class BubbleSort {



    public static void bubbleSort(int[] x) {

        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < (x.length-i); j++) {
                if (x[j-1] > x[j]) {
                    temp = x[j-1];
                    x[j-1] = x[j];
                    x[j] = temp;
                }
            }
        }

    }

    public static ArrayList<Integer> addToList(int[] x) {
        bubbleSort(x);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int val : x) {
            list.add(val);
        }
        return list;
    }


    public static void main(String[] args) {
        int[] x = {2, 3, 12, 1, 0, 23, 11, 9};
        ArrayList<Integer> list = addToList(x);
        System.out.println(list);
    }
}
