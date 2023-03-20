package absoft;
/*
Написать программу которая будет выводить цифры от 1 до 5 используя цикл for
 */

public class test6_for {
    public static void main(String[] args) {
        var from = 1;
        var to = 5;
        var step = 1;

        for (int i = from; i <= to; i += step) {
            System.out.print(i + " ");
        }
    }

}
