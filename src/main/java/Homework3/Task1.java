// дан произвольный список целых чисел:
// 1. Удалить из него все четные числа
// 2. найти мин значение
// 3. найти макс значение
// 4. найти среднее значение
package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);
        getUneven(list); // не работает метод почему? подскажите
        System.out.println(list);
        list.removeIf(value -> value%2 == 0);
        System.out.println(list);
        searchMinAndMaxValue(list);
        System.out.println("max = " + Collections.max(list));// другой вариант нахождения макс
        System.out.println("min = " + Collections.min(list));// другой вариант нахождения мин
        System.out.println(list.size());
        System.out.println(searchMiddleValue(list));
    }

    static void getUneven(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2 == 0) {
                arr.remove(i);
            }
        }
    }
    static void searchMinAndMaxValue(ArrayList<Integer> array){
        int min = array.get(0);
        int max = array.get(0);
        for (Integer item : array) {
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            }
        }
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
    static int searchMiddleValue(ArrayList<Integer> list2){
        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        return sum / list2.size();
    }
//    static void getUneven(Integer [] arr) {
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] % 2 == 0) {
//                arr.add;
//            }
//        }
}
