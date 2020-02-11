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
            String num1=sin.next();
            String num2=sin.next();
            
            long num11=Long.parseLong(num1, 2);
            long num22=Long.parseLong(num2, 2);
            
            if(num11==num22){
                 System.out.println("Case "+(i+1)+": Same");
            }
            else if(num11>num22){
                System.out.println("Case "+(i+1)+": A");
            }else if(num11<num22){
                System.out.println("Case "+(i+1)+": B");
            }
        }
    }
}