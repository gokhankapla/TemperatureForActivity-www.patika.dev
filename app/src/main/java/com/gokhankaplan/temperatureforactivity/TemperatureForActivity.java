package com.gokhankaplan.temperatureforactivity;

import java.util.Scanner;

public class TemperatureForActivity {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklıgı giriniz: ");
        temperature = input.nextInt();

        if (temperature<5) {
            System.out.println("Kayak yapabilirsiniz!");
        }
        else if(temperature>=5 && temperature<=10) {
            System.out.println("Sinemaya gidebiliriniz!");
        }
        else if(temperature>10 && temperature<=15) {
            System.out.println("Tebrikler! Hem sinemaya hem de piknige gidebilirsiniz!");
        }
        else if(temperature>15 && temperature<=25) {
            System.out.println("Piknige gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzme yapabilirsiniz!");
        }

    }
}
