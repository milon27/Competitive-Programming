/* https://www.codechef.com/problems/GOODBAD */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GOODBAD
{
	public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int t=sin.nextInt();
        for (int i = 0; i < t; i++) {
            int ln=sin.nextInt();
            int k=sin.nextInt();
            String s = sin.next();
            
            //frauD
            int low=0,up=0;
            for (int j = 0; j < ln; j++) {
                if(s.charAt(j)>='a' && s.charAt(j)<='z'){
                    low++;
                }else{
                    up++;
                }
            }
            if(low<=k && up<=k){// 4 5 - 5
                System.out.println("both");
            }else if(low<=k || up<=k){
                if(low<=k){
                    System.out.println("brother");
                }else{
                    System.out.println("chef");
                }
            }else{
                System.out.println("none");
            }
            
        }
    }
}
