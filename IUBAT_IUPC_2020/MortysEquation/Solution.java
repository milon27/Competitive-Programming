import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int t=sin.nextInt();
        for (int i = 0; i < t; i++) {
            long p,q,r,z;
            p=sin.nextLong();
            q=sin.nextLong();
            r=sin.nextLong();
            z=sin.nextLong();
            long sum=0;
            
            long x=0;
            if(q==0 && r==0){
                 System.out.println("Case "+(i+1)+": "+(z/p));
                 continue;
            }
            
            while(x!=Math.sqrt(z)){
                x++;
                //System.out.println("x"+x);
                sum=p*x+q*(x*x)+r*(x*x*x);
                if(sum==z){
                    System.out.println("Case "+(i+1)+": "+x);
                    break;
                }
            }
            
                
        }
    }
}