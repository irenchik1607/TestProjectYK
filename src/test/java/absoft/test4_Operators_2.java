package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию switch - case
 */

import java.util.Scanner;

public class test4_Operators_2 {
    public static void main(String[] args) {

        System.out.println("Введите номер дня недели: ");
        var numberDay = new Scanner(System.in).nextInt();

        String result;
        switch (numberDay) {
            case 1: {
                result ="Понедельник";
                break;
            }
            case 2: {
                result = "Вторник";
                break;
            } case 3: {
                result = "Среда";
                break;
            } case 4: {
                result = "Четверг";
                break;
            } case 5: {
                result = "Пятница";
                break;
            } case 6: {
                result = "Суббота";
                break;
            } case 7: {
                result = "Воскресенье";
                break;
            } default: {
                result = "Ошибка, введите число от 1 до 7";
                break;
            }
        }

        System.out.println(result);



    }

}
