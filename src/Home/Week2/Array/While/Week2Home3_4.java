package Home.Week2.Array.While;
import ua.artcode.Utils.ArrayUtils;




/**
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Week2Home3_4 {
    public static void main(String[] args) {
        int [] arr = new int [3];
        arr[0] = 12;
        arr[1] = 6;
        arr[2] = 2;
        int [] one = new int [3];
         one[0] = 9 ;
         one[1] = 7;
         one[2] = 5;
         int [] temp = {0, 0, 0};
        int i = 0;
       int j = 0;
        System.out.println(" maasiv arr");
       ArrayUtils.printArray(arr);

        {

            for (i = 0; i <= arr.length; i++) {
                temp[0]= arr[0];
                temp[1] =  arr[1];
                temp[2] =  arr[2];
              //  temp[i]= (arr[i])  ;


            }
            for (i = 0/*, j= 0 */; i <= 3; i++ /*, j++*/)
            { arr[0] = one[0];
              arr[1] = one[1];
              arr[2] = one[2];
              //  arr [i] = one[j];

            }
            for (i=0;i <= arr.length; i++ ) {
                one [0] = temp[0];
                 one[1] = temp[1];
                one[2] = temp[2];
            }
            System.out.println(" maasiv arr");
             ArrayUtils.printArray(arr);
               System.out.println(" maasiv one");
             ArrayUtils.printArray(one);
        }
    }
}
