package absoft;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class test8_for_2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число в диапазоне от 1 до 20");
        var number = new Scanner(System.in).nextInt();


        int dispValue = 1;

        if ((number >= 1) & (number <= 20)) {
            while (dispValue <= number) {
                System.out.print(dispValue++ + " ");
            }
        } else {
            System.out.println("Ошибка, введите число от 1 до 20");
        }

    }
}

