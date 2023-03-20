package absoft;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

import java.util.Arrays;

public class test10_array2 {
    public static void main(String[] args) {
        String[] array = {"John", "Dan", "Ashe", "Carl", "Bill"};

          Arrays.sort(array);
          String [] destination = new String [array.length +1];
          System.arraycopy(array, 0, destination, 0, array.length);

                 destination [5] = "Stan";
             for (int i = 0; i < 6; i++) {
                 System.out.println(destination[i]);
             }


    }
}
