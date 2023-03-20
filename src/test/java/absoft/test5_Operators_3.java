package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

import java.util.Scanner;

public class test5_Operators_3 {
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели: ");
        var ifNumberDay = new Scanner(System.in).nextInt();

        String result;
        if (ifNumberDay == 1) {
            result = "Понедельник";
        } else if (ifNumberDay == 2) {
            result = "Вторник";
        } else if (ifNumberDay == 3) {
            result = "Среда";
        } else if (ifNumberDay == 4) {
            result = "четверг";
        } else if (ifNumberDay == 5) {
            result = "Пятница";
        } else if (ifNumberDay == 6) {
            result = "Суббота";
        } else if (ifNumberDay == 7) {
            result = "Воскресенье";
        } else {
            result = "Ошибка, введите число от 1 до 7";
        }
        System.out.println(result);
    }
}
