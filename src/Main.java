public class Main {
    public static void main(String[] args) {
        ///Задагие 1 и 2
        ///Объявить переменную clientOS, которая равна 0 или 1. Где 0 — iOS, 1 — Android
        //Объявить переменную clientDeviceYear которая обозначает год телефона.
        //Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту
        // при наличии двух условий — операционной системы телефона (iOS или Android) и года производства.

        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 1)
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        if (clientOs == 0)
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        ///Задание 3
        ///Напишите программу, которая определяет, является ли год високосным или нет.
        //Небольшая справка: високосным является каждый четвертый год, но не является
        //каждый сотый. Также високосным является каждый четырехсотый год.

        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Год является високосным.");
        }else {
            System.out.println("Год не является високосным");
        }

        ///Задание 4
        ///Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //Напишите программу, которая выдает сообщение в консоль:
        //"Потребуется дней: " + срок доставки

        int deliveryDistance = 100;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        }else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }

        ///Задание 5
        ///Напишите программу, которая определяет по номеру месяца в году, к какому сезону
        // этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.

        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к Зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к Весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к Лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к Осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}