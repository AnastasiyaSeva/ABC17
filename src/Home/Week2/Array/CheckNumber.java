package Home.Week2.Array;
import java.util.Scanner;

/**
 * Created by nastya on 02.07.16.
 */
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int num = sc.nextInt();

        int i = num - 1;
        boolean isSimple = true;
        while(i>1 && isSimple){
            if(num % i == 0){
                isSimple = false;
            }
            i--;
        }
        System.out.println(num + " is simple?"+ isSimple);
    }
}
