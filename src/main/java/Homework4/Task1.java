// ввод и храннение данных ФИО возраст и пол людей
// вывод этих данных
//сортировка по возрасту
// сортировка id по возрасту через пузырьковую
// реализовать по возрасту и полу
package Homework4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String lastname = scanner.nextLine();
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите отчество: ");
        String patronymic = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите пол: ");
        String sex = scanner.nextLine();
        String fd = scanner.nextLine();

        ArrayList<String> lastnameList = new ArrayList<>();
        lastnameList.add(lastname);
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add(name);
        ArrayList<String> patronymicList = new ArrayList<>();
        patronymicList.add(patronymic);
        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.add(age);
        ArrayList<String> sexList = new ArrayList<>();
        sexList.add(sex);

        File file = new File("forHomework4.txt");
        writeAtFile(file, lastname,name, patronymic, age, sex );
        readFile(file);
        System.out.println();

//        for (int i = 0; i < ageList.size(); i++) {
//            ageList.sort(Comparator.naturalOrder());
//            System.out.println(ageList.get(i));
//        }

//        for (int i = 0; i < dataList.size(); i++) {
//            System.out.print(dataList.get(i) + " " );
//        }
//        System.out.println(dataList);
//        dataList.

    }
    public static void readFile  (File file){
        try (FileReader fw = new FileReader(file)) {
            int c;
            while((c = fw.read()) != -1){
                System.out.print((char)c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeAtFile(File file, String lastname, String name, String patronymic, Integer age, String sex) {
        try (var fw = new FileWriter(file)) {
            fw.write(lastname + " " + name + " " + patronymic + " " + age + " " + sex);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public static void readFile  (String lastname, String name, String patronymic, Integer age, String sex){
//        System.out.println(lastname + " " + name + " " + patronymic + " " + age + " " + sex);
//    }

}