package gui.sorting;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static int[] getascending(String text, int amount) {
        int angka, i, j, temp;
        angka = amount;
        int array[] = new int[angka];

        int x = 0;
        String[] tmp = text.split(",");
        for(String psh : tmp) {
            array[x] = Integer.parseInt(psh.trim());
            x++;
        }
        for(i = 0; i < (angka-1); i++) {
            for(j = 0; j < (angka -1); j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] getdescending(String text, int amount){
        int angka, i, j, temp;
        angka = amount;
        int array[] = new int[angka];

        int x = 0;
        String[] tmp = text.split(",");

        for (String psh : tmp){
            array[x] = Integer.parseInt(psh.trim());
            x++;
        }
        for (i = 0; i < (angka-1); i++) {
            for (j = 0; j < angka-i-1; j++) {
                if (array[j]<array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
