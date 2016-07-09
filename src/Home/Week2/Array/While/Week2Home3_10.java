package Home.Week2.Array.While;
import ua.artcode.Utils.ArrayUtils;
import java.util.Scanner;

/**
 * public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
 */
public class Week2Home3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");

        int size = sc.nextInt();
        System.out.println("Enter array start");

        int a = sc.nextInt();
        System.out.println("Enter array end");

        int b = sc.nextInt();
        int[] mas = ArrayUtils.CreateAndFillRandomArray(size, a, b);



        int end = a;
        int start = b;
        int[] split = new int[end - start];

        for (int i = 0; i < split.length; i++) {
            split[i] = mas[start + i];
        }
        System.out.println("  "+split);

    }
}
