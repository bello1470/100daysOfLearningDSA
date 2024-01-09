package org.bellotech;
import java.util.Arrays;
public class ConversionTest {




        public static void main(String[] args) {
            int n = 5;
            int m = 3;
            String x = "abcde";
            String y = "aec";

            int result = conversion(n, m, x, y);
            System.out.println("Min number of operations: " + result);
        }

        static int conversion(int n, int m, String x, String y) {
            int[] accolite = new int[m + 1];
            Arrays.fill(accolite, Integer.MAX_VALUE);
            accolite[0] = 0;

            for (int i = 0; i < m; i++)
                for (int j = n - 1; j >= 0; j--)
                    if (x.charAt(j) == y.charAt(i)) {
                        accolite[i + 1] = Math.min(accolite[i + 1], accolite[i] + 1);
                        break;
                    }

            return accolite[m] == Integer.MAX_VALUE ? Integer.MAX_VALUE : accolite[m];
        }
    }


