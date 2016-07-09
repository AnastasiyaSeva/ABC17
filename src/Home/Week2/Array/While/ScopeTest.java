package Home.Week2.Array.While;

/**
 * Created by nastya on 03.07.16.
 */
public class ScopeTest {
    // Where am i?
    // What can i take? (scope variables, blocks)
    public static void main(String[] args) {

        // Where am i?
        // What can i take? (scope variables, blocks)


            int i = 23;

            i++;

            //c++

            if (true) {
                int b = 89;
                i++;
                if (true) {
                    i++;
                    int c = 89;
                }

                //c++;
            }

            //b++;

            int c = 56;
        }
    }
