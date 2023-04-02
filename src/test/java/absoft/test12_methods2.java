package absoft;

/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class test12_methods2 {

    public static void main(String[] args) {
        System.out.println("Please, write your name");
        String writeName = new Scanner(System.in).nextLine();
        String value = name(writeName);

        if (value.equals("no")) {
            System.out.println("Sorry, name was not found");
        } else {
            System.out.println("Hello " + value);
            System.out.println("Your seat is " + seatNumber(value));
        }
    }

    private static String name(String n) {

        if (n.equals("Alex") || n.equals("John") || n.equals("Stan")) {
            return n;
        } else {
            return "no";
        }
    }

    private static String seatNumber(String nameForSearchNumber) {

        String[] array = {"Alex", "John", "Stan"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(nameForSearchNumber)) {
                return String.valueOf(i + 1);
            }
        }
        return null;
    }

}

