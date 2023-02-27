package absoft;
// import java.util.Scanner;

/*
Напишите программу в которой пользователь должен ввести с клавиатуры name и age

Выведите на экран 2 строки:
Hello (name)
Your age is (age)
 */

import java.util.Scanner;

public class test1_simplePrint {

    public static void main (String [] args) {

        var name = new Scanner(System.in).nextLine();

        var age = new Scanner(System.in).nextInt();

        var rezName = "Hello, " + name;
        System.out.println(rezName);

        var rezAge = "Your age is " + age;
        System.out.println(rezAge);

    }
}


