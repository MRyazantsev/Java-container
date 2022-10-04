package org.example;

import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* интерфейс включает:
            "0" - выход из программы
            "1" - добавление в конец элемент списка с заданным числом
            "2" - удаление из списка элемент с заданным числом
            "3" - извлечь из списка число, стоящее на месте, задаваемом пользователем
            "4" - печать списка
        */
        container List = new container();

        Scanner sc = new Scanner(System.in);
        int cmd = 1;
        int object;

        while(cmd != 0){
            switch(cmd){
                case 1:
                    System.out.print("Введите число, которое хотите вставить в список: ");
                    object = sc.nextInt();
                    List.add(object);
                    break;
                case 2:
                    System.out.print("Введите элемент, который хотите удалить: ");
                    object = sc.nextInt();
                    List.remove(object);
                    break;
                case 3:
                    System.out.print("Введите номер ячейки, чье значение хотите извлечь: ");
                    object = sc.nextInt();
                    System.out.println("Значение извлекаемого элемента: " + List.get(object));
                    break;
                case 4:
                    List.print();
                    break;
                default:
                    System.out.println("Введена несуществующая команда");
                    break;
            }
            System.out.print("Введите следующую команду: ");
            cmd = sc.nextInt();
        }
    }
}
