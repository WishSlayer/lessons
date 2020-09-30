package lesson2;

public class SecondLesson {
    public static void main(String[] args) {
        // if else
        /*
        if (условие1) {
          если условие1 = true, то выполняется набор инструкций
        } else if (условие2) {
          если условие1 = false и условие2 = true, то выполняется набор инструкций
        } else if (условие3) {
          если условие1 = false, условие2 = false и условие3 = true, то выполняется набор инструкций
        } else {
          набор инструкций выполняется, если все предыдущие условия false
        }
        */

        int state = 0;
        // 0 - вывести на экран "Закрытие приложения"
        // 1 - вывести на экран "Запуск приложения"
        // в остальных случаях "Ошибка статуса"
        if (state == 0) {
            System.out.println("Закрытие приложения");
        } else if (state == 1) {
            System.out.println("Запуск приложения");
        } else {
            System.out.println("Ошибка статуса");
        }

        // логические операторы
        // возвращают true/false
        // && и
        // || или
        // ! не
        // ^ исключающее или
        /*
        state = 0;
        int code = 60;
        (state == 0 && code > 100) // false
        age = 30;
        exp = 10;
        (age > 30 && exp > 7) // false
        (age > 30 || exp > 7) // true
        !(age > 30 || exp > 7) // false
        isClosed = false;
        !isClosed // true
        (state == 0 ^ code > 100) // false
        */

        int count = 50;
        // 100 - 90 правильных ответов - 5
        // 89 - 60 правильных ответов - 4
        // 59 - 40 правильных ответов - 3
        // 39 - 0 правильных ответов - 2
        if (count > 100 || count < 0) {
            System.out.println("Ошибка приложения");
        } else if (count >= 90 && count <= 100) {
            System.out.println("Оценка - 5");
        } else if (count >= 60 && count <= 89) {
            System.out.println("Оценка - 4");
        } else if (count >= 40 && count <= 59) {
            System.out.println("Оценка - 3");
        } else {
            System.out.println("Оценка - 2");
        }

        /*
        switch (выражение/переменная) {
          case выражение1/значение1:
            инструкции;
            break;
          case выражение2/значение2:
          case выражение3/значение3:
            инструкции;
            break;
          case выражение4/значение4:
            инструкции;
            break;
          default:
            инструкции;
            break;
        }

        выражение/переменная могут быть:
        byte (Byte), short (Short), char (Character), int (Integer), String, enum (перечисления)
        выражение сравнивается с case при найденном совпадении switch выполняются инструкции от соответствующего
        case до первого break или конца конструкции switch
         */

        int sum = 10000;
        int code = 5698;
        // 4653 - скидка 30%
        // 5698, 5111 - скидка 20%
        // 6922, 6113, 6099 - скидка 10%
        // в остальных случаях скидки нет
        // Вывести сумму с учетом скидки
        switch (code) {
            case 4653:
                System.out.println(sum * 0.7);
                break;
            case 5698:
            case 5111:
                System.out.println(sum * 0.8);
                break;
            case 6922:
            case 6113:
            case 6099:
                System.out.println(sum * 0.9);
                break;
            default:
                System.out.println(sum);
        }

    }
}
