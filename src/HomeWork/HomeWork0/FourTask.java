package HomeWork.HomeWork0;
/*
Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
в интервал (25;200) и выводить результат в консоль.
Примеры работы программы:
Число 345 не содержится в интервале (25;200)
Число 110 содержится в интервале (25;200)
 */
public class FourTask {
    public static void main(String[] args) {
        int min = 10;
        int max = 500;
        int num = min + (int) (Math.random() * ((max - min) + 1));
        if (num > 25 && num < 200) System.out.println("Число " + num + " содержится в интервале (25; 200)");
        else System.out.println("Число " + num + " не содержится в интервале (25; 200)");
    }
}
