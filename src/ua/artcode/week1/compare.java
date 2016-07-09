package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by nastya on 01.07.16.
 */
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite a ");
        float a = sc.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.println("vvedite b ");
        float b = sc.nextInt();
        if (a % 10 == b % 10)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
