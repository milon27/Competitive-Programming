import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in); 
        int t=sin.nextInt();
        for (int i = 0; i < t; i++) {
            //10101010010110
            String s=sin.next();
            char[] sar=s.toCharArray();
            
            long n_10=0;
            long n_01=0;
            
            for (int j = 0; j < sar.length-1; j++) {
                if(sar[j]=='1' && sar[j+1]=='0' ){
                    n_10++;
                }else if(sar[j]=='0' && sar[j+1]=='1' ){
                    n_01++;
                }
            }
            //Number of 01: 5
            //Number of 10: 6
            //No One is the Dominator
           // 10 is the Dominator
            System.out.println("Number of 01: "+n_01);
            System.out.println("Number of 10: "+n_10);
            if(n_01>n_10){
                System.out.println("01 is the Dominator");
            }else if(n_01<n_10){
                System.out.println("10 is the Dominator");
            }else{
                System.out.println("No One is the Dominator");    
                    }
            System.out.println("");
            
        }
    }
}