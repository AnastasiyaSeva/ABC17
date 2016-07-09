package Home.Week2.Array;

import java.util.Scanner;


/**
 * Created by nastya on 03.07.16.
 */
public class Random {
    public static void main(String[] args) {


        int n, arr[];
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        System.out.print("Введите цифру a : ");

       // n = in.nextInt();
        a = in.nextInt();

        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        for (int i : arr)
            System.out.print(i + " ");
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] == a )
     //   public static int[] CreateReplase {
                System.out.println(" встречается "+i);
        }
    }
}

