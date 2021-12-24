package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(number(15, 18));
        System.out.println(number(40, 0));
        System.out.println(number(10, 35));
        System.out.println(number(23, -10));
        System.out.println(number(28, 20));
    }

    public static String number(int ageOfMe, int temperature) {

        if (ageOfMe > 20 && ageOfMe < 45 && temperature > -20 && temperature < 30) {
            return "можно идти гулять";
        } else if (ageOfMe < 20 && temperature > 0 && temperature < 28) {
            return "  можно идти гулять ";
        } else if (ageOfMe > 45 && temperature > -10 && temperature < 25) {
            return "можно идти гулять";
        }else {
            return "оставайтесь дома";
        }


    }
}






