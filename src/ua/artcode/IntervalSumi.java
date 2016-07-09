package ua.artcode;

import java.util.Scanner;

/**
 * Created by nastya on 01.07.16.
 */
public class IntervalSumi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite a ");
        int a = sc.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.println("vvedite b ");
        int b = sc.nextInt();

        if ((a + b) >= 11 && (a + b) <= 19)
            System.out.println("Suma vvedenih chisel prinadlejit intervalu [11;19] i ravna " + (a + b));
        else
            System.out.println("Suma vvedenih chisel ne prinadlejit intervalu [11;19] i ravna" + (a + b));
    }
}
