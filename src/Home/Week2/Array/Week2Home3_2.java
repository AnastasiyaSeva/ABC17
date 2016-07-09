package Home.Week2.Array;
import ua.artcode.Utils.ArrayUtils;

import java.util.Scanner;

/**
 * Найти среднее арифметическое массива
 */
public class Week2Home3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");
        int size = sc.nextInt();
        int sum = 0;
        int average = 0;

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * size);
        }

        ArrayUtils.printArray(arr);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;

        System.out.println(" " + average);
    }
}
