package LoopingStatements;

import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) {
        // инкремент - увеличивает значение переменной на 1
        // постфиксный х++ (возвращает значение, потом увеличивает)
        // префиксный ++х (увеличивает значение, потом возвращает)
        // декремент - уменьшает значение переменной на 1
        // постфиксный х-- (возвращает значение, потом уменьшает)
        // префиксный --х (уменьшает значение, потом возвращает)
        int a = 2;
        int res = a++ - ++a + a++ + a++ + a; // 2 - 4 + 4 + 5 + 6 = 13
        System.out.println(res);

        int s = 1;
        int res2 = --s + s++ + s++ + s-- - --s -s; // 0 + 0 + 1 + 2 - 0 - 0 = 3
        System.out.println(res2);

        int z = 3;
        int res3 = z - --z + z++ + ++z - z + ++z + --z - z-- - z; // 3 - 2 + 2 + 4 - 4 + 5 + 4 - 4 - 3 = 5
        System.out.println(res3);

        // цикл while
        /*
        while(условие) { условие - true/false
          инструкции в теле цикла
        }
        */

        // вывести на экран числа из отрезка [55;78]
        int b = 55;
        while (b <= 78) {
            System.out.println("b = " + b++);
        }
        // пользователь вводит с клавиатуры целое число
        // необходимо вывести число увеличенное на 2
        // цикл прерывает свою работу, если пользователь ввел 0
        Scanner scanner = new Scanner(System.in);
        /*int num = 1;
        while (num != 0) {
            System.out.println("Введите целое число: ");
            num = scanner.nextInt();
            if (num != 0) System.out.println(num + 2);
        }*/

        // цикл do while - выполнит обязательно одну итерацию
        int num;
        do {
            System.out.println("Введите целое число: ");
            num = scanner.nextInt();
            if (num != 0) System.out.println(num + 2);
        } while (num != 0);

        // цикл for
        // for (;;) - бесконечный цикл
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

        // Пользователь! загадывает число в диапазоне [1, 100]
        // Программа угадывает это число
        // Программа модет задать следующие вопросы:
        // 1. Число равно х?
        // 2. Число больше х?
        // 3. Число меньше х?
        // 0 - нет / 1 - да
        // Делением отрезков решается данная задача

        // Math.random()
    }
}
