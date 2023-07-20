// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int clientOS = 0; // 0 - iOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Приложение недоступно для данной скачивания");
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else {
            System.out.println("Приложение недоступно для данной скачивания");
        }
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int deliveryDistance = 195;
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        }
        else if (deliveryDistance < 60) {
            deliveryTime = 2;
        }
        else if (deliveryDistance < 100) {
            deliveryTime = 3;
        }
        else {
            System.out.println("Доставки нет");
            return;
        }
        System.out.println("Доставка займет " + deliveryTime + " дней");
    }

    public static void task5() {
        System.out.println("Задача 4:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2:
                System.out.println("В этом месяце зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("В этом месяце весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("В этом месяце лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("В этом месяце осень");
                break;
        }

    }
}