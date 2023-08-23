package org.itstep;

import org.itstep.entities.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        User u = new User();
//        u.setEmail("adfadfa");
//        u.setPassword("sdgsrg");
//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
        Task6();
    }

    public static void Task1(){
//        Задание 1
//        Выведите на экран надпись "Your time is limited, so
//        don’t waste it living someone else’s life" Steve Jobs на разных
//        строках.

        System.out.println("Your time is limited,\n" +
                "\tso don’t waste it\n" +
                "\t\tliving someone else’s life”\n" +
                "\t\t\tSteve Jobs");
    }
    public static void Task2(){
//        Задание 2
//        Пользователь вводит с клавиатуры два числа. Первое
//        число — это значение, второе число процент, который
//        необходимо посчитать. Например, мы ввели с клавиатуры
//        50 и 10. Требуется вывести на экран 10 процентов от 50.
//        Результат: 5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введите процент: ");
        double percent = scanner.nextInt();
        scanner.nextLine();
        double res = (number * percent) / 100;
        System.out.println("Процент " + percent + "% от числа " + number + " равен " + res);
    }
    public static void Task3(){
//        Задание 3
//        Пользователь вводит с клавиатуры три цифры.
//        Необходимо создать число, содержащее эти цифры.
//        Например, если с клавиатуры введено 7, 3, 8,
//        тогда нужно сформировать число 738.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую цифру: ");
        int numb1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите вторую цифру: ");
        int numb2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите третью цифру: ");
        int numb3 = scanner.nextInt();
        scanner.nextLine();

        String res = String.valueOf(numb1) +  String.valueOf(numb2) +  String.valueOf(numb3);

        System.out.print("Результат: " + res);
    }
    public static void Task4(){
//        Задание 4
//        Пользователь вводит шестизначное число. Необходимо
//        поменять в этом числе первую и шестую цифры, а также
//        вторую и пятую цифры.
//        Например, 723895 должно превратиться в 593827.
//        Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");

        int number = scanner.nextInt();
        if (number >= 100000 && number <= 999999) {
            int digit1 = (number / 100000) % 10;
            int digit2 = (number / 10000) % 10;
            int digit3 = (number / 1000) % 10;
            int digit4 = (number / 100) % 10;
            int digit5 = (number / 10) % 10;
            int digit6 = number % 10;

            int swappedNumber = digit6 * 100000 + digit5 * 10000 +
                    digit3 * 1000 + digit4 * 100 +
                    digit2 * 10 + digit1;

            System.out.println("Исходное число: " + number);
            System.out.println("Число после перестановки: " + swappedNumber);
        } else {
            System.out.println("Введите корректное шестизначное число.");
            Task4();
        }
        scanner.close();
    }
    public static void Task5(){
//        Задание 5
//        Пользователь вводит с клавиатуры номер месяца (от
//        1 до 12). В зависимости от полученного номера месяца
//        программа выводит на экран надпись: Winter (если введено
//                значение 1,2 или 12), Spring (если введено значение от 3
//                до 5), Summer (если введено значение от 6 до 8), Autumn
//                (если введено значение от 9 до 11).
//                Если пользователь ввел значение не в диапазоне от 1
//        до 12 требуется вывести сообщение об ошибке.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");

        int number = scanner.nextInt();

        if(number < 1 || number > 12)
        {
            System.out.println("Введите корректное число");
            Task5();
        }

        if(number >=1 && number <= 2 || number == 12){
            System.out.println("Winter");
        }
        if(number >=3 && number <= 5){
            System.out.println("Spring");
        }
        if(number >=6 && number <= 8){
            System.out.println("Summer");
        }
        if(number >=9 && number <= 11){
            System.out.println("Autumn");
        }
    }
    public static void Task6(){
//        Задание 6
//        Пользователь вводит с клавиатуры количество метров.
//        В зависимости от выбора пользователя программа
//        переводит метры в мили, дюймы или ярды.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество метров: ");
        double number = scanner.nextDouble();

        System.out.println("1 - перевод в Мили");
        System.out.println("2 - перевод в Дюймы");
        System.out.println("3 - перевод в Ярды");
        System.out.println("Введите цифру: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        boolean isValid = false;
        while(!isValid)
        {
            if(choice < 1 || choice > 3){
                System.out.println("Ввод неверный. Введите еще раз: ");
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            else{
                isValid = true;
            }
        }

        if(choice == 1){
            double res = number * 0.000621371;
            System.out.println(number + " метров равно " + res + " милям");
        }

        if(choice == 2){
            double res = number * 39.3701;
            System.out.println(number + " метров равно " + res + " дюймам");
        }

        if(choice == 3){
            double res = number * 1.09361;
            System.out.println(number + " метров равно " + res + " ярдам");
        }

        scanner.close();
    }
    public static void Task7(){

    }


}