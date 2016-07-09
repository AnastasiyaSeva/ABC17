package Home.Week2.Array.While;
import ua.artcode.Utils.ArrayUtils;
import java.util.Scanner;

/**
 * Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
 */
public class Week2Home3_5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");
        int size = sc.nextInt();
        System.out.println("Insert interval from a ");
        int a = sc.nextInt();

        System.out.println("to b");
        int b = sc.nextInt();
        System.out.println("Insert number what we must find");
        int x = sc.nextInt();

        int[] array = ArrayUtils.CreateAndFillRandomArray(size, a, b);
        ArrayUtils.printArray(array);
        int cout = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                cout = cout + 1;
        }
        System.out.println("cout number =  " + cout);
    }
}
