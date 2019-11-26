/*
Задание 3 (дополнительно)
Написать программу, которая просит пользователя ввести с клавиатуры 2 числа. После чего это программа производит над этими числами математические действия и выводит результаты в консоль:
1. сумма
2. умножение
3. деление
4. разница
5. деление по модулю
6. ==
7. <
8. >
*/

import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double first = Double.parseDouble(scanner.nextLine());
        //int first = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number:");
        double second = Double.parseDouble(scanner.nextLine());
        //int second = Integer.parseInt(scanner.nextLine());
        System.out.println(" Addition(+)= " + (first + second));
        System.out.println(" Multiplication(*)= " + (first * second));
        System.out.println(" Division(/)= " + (first / second));
        System.out.println(" Subtraction(-)= " + (first - second));
        System.out.println(" Division with remainder(%)= " + (first % second));
        System.out.println(" Equality(==)= " + ( first == second));
        System.out.println(" Equality(<)= " + ( first < second));
        System.out.println(" Equality(>)= " + (first > second));



    }
}
