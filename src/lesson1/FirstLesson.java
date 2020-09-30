package lesson1;

public class FirstLesson {
    //  cmd + / однострочный комментарий
    /*
     cmd + shift + / многострочный комментарий
     */
    // cmd + alt + L выравнивание кода (для мака хз)

    // точка входа в программу - то место откуда начинается выполнение программы
    // метод main (один на всю программу)
    public static void main(String[] args) {
        // sout
        // консольный вывод
        System.out.println("lesson1.FirstLesson");

        // Типы данных:
        // 1. примитивные типы данных
        // для хранение целых чисел
        // тип byte от -128 до 127 (1 байт) в основном для передачи данных по сети

        // объявление переменных
        // тип_данных имя_переменной;
        byte byteVar;
        byteVar = 35; // присвоили значение 35 переменной
        byteVar = 12; // переопределили значение переменной
        byte byteVar2 = 10;
        byte byteVar3, byteVar4;
        byte byteVar5 = 12, byteVar6 = 22;

        // short (2 байта) от -32768 до 32767
        short shortVar = -155;

        // int (4 байта) от - 1 000 000 000 до 1 000 000 000
        int intVar = 5340;
        int intVar2 = 1_000_000; // на код не влияет, удобство кода
        int intVar3 = 1000000;

        // long (8 байт) от -1 000 000 000 000 000 000 до 1 000 000 000 000 000 000
        // Если число большое то обязательно в конце добавляем L или l
        long longVar = 30000000000L;
        // long longVar = 3000000000 воспринимается, как int, поэтому нужно явно указать 3000000000L

        // числа с плавающей точкой
        // float (4 байта)
        float floatVar = 5.7f;

        // double (8 байт)
        double doubleVar = 10.88;

        // char (2 байта) от 0 до 65535
        // хранит номер символа в таблице юникода

        // boolean true/false
        boolean booleanVar = true;
        boolean booleanVar1 = false;

        // Приведение типов:
        // автоматическое приведение типов
        byte someByte = 10;
        int someInt = someByte;

        // явное приведение типов (на свой страх и риск, что получим - неизвестно)
        someInt = 200;
        someByte = (byte) someInt;

        // операторы
        // операторы присваивания
        // = | += | -= | *= | /= | %=

        someByte = 3;
        // someByte = someByte * 7;
        someByte *= 7;

        someInt = 10;
        someInt = someInt + 20;
        someInt += 20;
        System.out.println(someInt);

        // арифметические операторы
        // + | - | / | * | % (остаток от деления)
        int a = 10;
        int b = 90;

        int c = a + b;
        System.out.println(c);

        short x = 56;
        short y = 77;

        // short z = x + y;
        int res = x + y;
        long r1 = x + y;
        short z = (short) (x + y);

        // Деление на ноль
        int n = 100;
        double m = 200.6;

        // Целочисленное деление на ноль невозможно
        // int zeroDiv = n / 0;
        // System.out.println(zeroDiv);

        // При делении double на ноль получается Infinity или -Infinity
        double zeroDiv2 = m / 0;
        System.out.println(zeroDiv2);

        a = 7;
        b = 2;
        c = a / b;
        System.out.println(c);

        System.out.println(9 % 3); // 0

        // операторы сравнения
        // результат работы операторов сравнения true или false
        // < | > | <= | >= | != | ==

        System.out.println(6 < 22); // true
        System.out.println(6 > 22); // false
        System.out.println(55 >= 55); // true
        System.out.println(55 <= 55); // true
        System.out.println(2 != 55); // true
        System.out.println(2 == 55); // false

        // тернарный оператор ?
        // переменная =  (условие) ? выражение 1 : выражение 2;
        // если истина то выражение 1, если ложь то выражение 2
        int k = 4;
        int l = 8;

        int result = (k < l) ? k + l : k - l;

        // дана переменная типа int
        // если значение переменной четное, тернарный оператор возвращает результат деления
        // этой переменной на 2 в противном случае результат умножеия на 2
        // вывести в консоль результат
        int rer = 60;
        int result2 = (rer % 2 == 0) ? rer / 2 : rer * 2;
        System.out.println(result2);
        

        // 2. ссылочные типы данных
    }
}
