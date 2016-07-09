package Home.Week2.Array;

import ua.artcode.Utils.ArrayUtils;

import java.util.Scanner;

/**
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Week2Home3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int [] array  = ArrayUtils.CreateAndFillRandomArray(size, 20, 130);
        ArrayUtils.printArray(array);


        System.out.println();
        int min = array[0];
        int max = array[0];


        for (int i = 0; i != array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] >= max) {
                max = array[i];

            }}
        {  System.out.println( max+" = max  and min = "+min);

        }

        }}

