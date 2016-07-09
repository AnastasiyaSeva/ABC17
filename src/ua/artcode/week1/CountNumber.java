package ua.artcode.week1;


import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by nastya on 02.07.16. ne vishlo(
 */
public class CountNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input array size");

        int size = sc.nextInt();

        int[] mas = new int[size];


        System.out.println("napolnite massiv: ");
        for (int i = 0; i < size; i++) {
            System.out.println("[" + (i + 1) + "]: ");

        }
    }
}
