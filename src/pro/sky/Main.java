package pro.sky;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // 1) year
        int year = 2022;
        checkYear(year);

        // 2) device
        int currentYear = LocalDate.now().getYear();
        checkUpdates(1,currentYear);

        // 3) delivery
        int deliveryDistance = 100;
        getDeliveryTime(deliveryDistance);
    }

    public static void checkYear(int year){
        if(year%400==0 || (year%4==0) && year%100!=0){
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void checkUpdates(int clientOS, int clientDeviceYear){
        if(clientOS==1)
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        else if(clientOS==0)
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
    }

    public static void getDeliveryTime(int deliveryDistance){
        if(deliveryDistance<20){
            System.out.println("Потребуется дней: "+1);

        } else {
            deliveryDistance = deliveryDistance - 20;
            System.out.println("Потребуется дней: "+ (deliveryDistance/40+2));
        }
    }
}
