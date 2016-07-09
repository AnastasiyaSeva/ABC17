package Home.Week2.Array.While;

import ua.artcode.Utils.ArrayUtils;

import java.util.Scanner;

/**
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class Week2Home3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array leght");
        int size = sc.nextInt();

        System.out.println("Enter array interval from a");
        int a = sc.nextInt();

        System.out.println("Enter array to b");
        int b = sc.nextInt();

        int min = a;
        int max = b;
        int cout = 0;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
            if (array[i] % 2 == 0)
                cout = cout + 1;
        }
        ArrayUtils.printArray(array);

        System.out.println(" Count of double elements array  " + cout);
        System.out.println();

        int cout1 = 0;
        int[] array1 = new int[size];

        for (int i = 0; i < size; i++) {
            array1[i] = (int) (min + Math.random() * (max - min));

            if (array[i] % 2 == 0)
                cout1 = cout1 + 1;
        }
        ArrayUtils.printArray(array1);

        System.out.println(" count double counts of array1 is  " + cout1);
        System.out.println(" count double counts of array1 is  " + cout + "; count1 double counts of array1 is  " + cout1);


    }
}
