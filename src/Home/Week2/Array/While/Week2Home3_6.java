package Home.Week2.Array.While;
import ua.artcode.Utils.ArrayUtils;
import java.util.Scanner;

/**
 * Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class Week2Home3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");
        int size = sc.nextInt();
        int[] mas = ArrayUtils.CreateAndFillRandomArrayWithoutInterval(size);


        int sum1 = 0;
        int sum2 = 0;
        int halfmas = mas.length / 2;

        for (int i = 0; i < halfmas; i++) {
            sum1 += mas[i];
        }
        for (int i = halfmas; i < mas.length; i++) {
            sum2 += mas[i];
        }

        if (sum1 / halfmas > sum2 / halfmas) {

            for (int i = 0; i < halfmas; i++) {
                System.out.print(mas[i] + ",  ");
            }

        } else {

            for (int i = halfmas; i < mas.length; i++) {
                System.out.print(mas[i] + ", ");
            }
            System.out.println( " " );
            ArrayUtils.printArray(mas);

        }
    }}

