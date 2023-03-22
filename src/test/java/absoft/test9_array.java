package absoft;
/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в следующем виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */


//vimport java.util.Arrays;

public class test9_array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 1;

            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }


        }


    }
}
