/*
 * https://www.codechef.com/problems/SAFEROBO
 */


import java.util.Scanner;

/**
 * @author milon
 */
public class SAFEROBO {
   public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int t = sin.nextInt();
        for (int ii = 0; ii < t; ii++) {
            String s = sin.next();
            long sa = sin.nextLong();
            long sb = sin.nextLong();
            char[] ch = s.toCharArray();
           
            int start = 0;
            int end = s.length() - 1;
            for (int j = 0; j < s.length(); j++) {
                if (ch[j] == 'A') {
                    start = j;
                } else if (ch[j] == 'B') {
                    end = j;
                    break;
                }
            }

            System.out.println( "start=" + (start) + " end=" + (end));

           
            if ((((start) - (end)) % (sa + sb)) == 0) {
                System.out.println("unsafe");
            } else {
                System.out.println("safe");
            }

            
        }
    }
}
