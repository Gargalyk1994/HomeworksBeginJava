package Homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 2, 8, 3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length-1; j++) {
                if (mas[i] < mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }

            }
        }
        return mas;

    }
}
