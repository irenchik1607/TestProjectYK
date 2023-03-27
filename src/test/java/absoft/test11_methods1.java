package absoft;

/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */

public class test11_methods1 {

    private static double total(double price, int qty) {
        return price * qty * 0.8;
    }

    public static void main(String[] args) {
        double price = 3.6;
        int qty = 7;

        System.out.println("Your total = " + total(price, qty));
    }

}
