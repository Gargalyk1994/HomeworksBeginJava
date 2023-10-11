package Homework6;
//        1. Подумать над структурой класса Ноутбук (Laptop) для магазина техники - выделить поля и методы.
//        Реализовать в java.
//        2. Создать множество ноутбуков Set<Laptop>. (добиться чтобы во множестве не было одинаковых ноутбуков)
//        3. (*) Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
//        выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//        Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
//        можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Laptop {
    String name;
    int hardDisk;
    int RAM;
    String processor;
    int sizeOfСores; // количество ядер
    String graphicsСard;
    String color;
    String type;

    public Laptop (String name, int hardDisk, int RAM, String processor, String color){
        this.name = name;
        this.hardDisk = hardDisk;
        this.RAM = RAM;
        this.processor = processor;
        this.color = color;
    }

    public boolean equals (Object laptop){ // переопределили метод equals который был в Java по умолчанию
        Laptop newLaptop = (Laptop) laptop;
        return  this.name.equals(newLaptop.name) && this.hardDisk == newLaptop.hardDisk
                && this.RAM == newLaptop.RAM && this.processor.equals(newLaptop.processor)
                && this.color.equals(newLaptop.color); // приравняли
    }
    public int hashCode(){
         return (int) (this.name.hashCode() + this.hardDisk + this.RAM + this.processor.hashCode() + this.color.hashCode());
    }

    public String toString() { // переопределили метод toString который был в Java по умолчанию
        return String.format("name: %s, hardDisk: %s, RAM: %s, processor: %s, color: %s \n",name, hardDisk, RAM, processor, color);
    }

    public void filterForUsers(HashSet<Laptop> laptops){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter number of parametrs: \n 1. Memory of hard disk(Gb) \n 2. RAM(Gb) \n 3. Color \n 4. Name of processor");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter memory of hard disk: ");
                int choiceHardDisk = sc.nextInt();
                if (choiceHardDisk == this.hardDisk) {
                    System.out.println(this.hardDisk);
                }
                break;
            case 2:
                System.out.println("Enter RAM: ");
                int choiceRAM = sc.nextInt();
                break;
            case 3:
                System.out.println("Enter color: ");
                String choiceColor = sc.nextLine();
                break;
            case 4:
                System.out.println("Enter name of processor: ");
                String choiceProcessor = sc.nextLine();
                break;
            default:
                System.out.println("Incorrect data entered. Try again!!!");
        }
//        switch (){
//            case 4:
//
//
//        }
    }

    public static void main(String[] args) {
        Laptop lenovo1 = new Laptop("Lenovo856", 512, 16, "IntelCore i5", "black");
        Laptop acer1 = new Laptop("Acer4566", 1028, 4, "IntelPentium i3", "blue");
        Laptop acer3 = new Laptop("Acer4566", 1028, 4, "IntelPentium i3", "blue");
        Laptop asus1 = new Laptop("Asus2342", 256, 32, "IntelPentium i3", "green");
        Laptop msi1 = new Laptop("MSI4577", 1028, 4, "IntelPentium i5", "white");
        Laptop dexp1 = new Laptop("DEXP3302", 128, 8, "IntelPentium i7", "grey");
        Laptop lg1 = new Laptop("LG4521", 1028, 8, "IntelPentium i3", "white");
        Laptop lg2 = new Laptop("LG4521", 1028, 8, "IntelPentium i3", "white");
        Laptop acer2 = new Laptop("Acer1132", 512, 12, "IntelPentium i5", "grey");
        Laptop dexp2 = new Laptop("Dexp3205", 1028, 8, "IntelPentium i7", "black");
        Laptop asus2 = new Laptop("Asus2109", 512, 4, "IntelPentium i3", "white");

        HashSet<Laptop> setLaptops = new HashSet<>(List.of(lenovo1,acer1,acer2,acer3,dexp1,dexp2,asus1,asus2,msi1,lg1,lg2));
        System.out.println(setLaptops);
//        HashMap <Laptop, Integer> filterHardDisk = new HashMap<>();
//        filterHardDisk.put(setLaptops.getClass(), setLaptops.hardDisk);
//        filterForUsers(setLaptops);
    }
}
