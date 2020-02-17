/*
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author milon
 */
public class CHEFINSQ {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int t=sin.nextInt();
        for (int ii = 0; ii < t; ii++) {
            int n=sin.nextInt();
            int l=sin.nextInt();//2
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sin.nextInt();
            }
           
            //input done 4 3 2 1
            //sort the list
            Arrays.sort(arr);
            // 1 2 3 4 -(1+2=3)
            int total_count=0;
            int inside_count=0;
            for (int i = 0; i < n; i++) {// here border is 2
                if(arr[i]==arr[l-1]){
                    total_count++;
                }
                //inside count
                if(i<l && arr[i]==arr[l-1]){
                    inside_count++;
                }
            }
           
            //border_count=1;
            //1 c 
            printNcR(total_count,inside_count);
        }
    }

    // Function to find the nCr  
    static void printNcR(int n, int r) { 
  
        // p holds the value of n*(n-1)*(n-2)...,  
        // k holds the value of r*(r-1)...  
        long p = 1, k = 1; 
  
        // C(n, r) == C(n, n-r),  
        // choosing the smaller value  
        if (n - r < r) { 
            r = n - r; 
        } 
  
        if (r != 0) { 
            while (r > 0) { 
                p *= n; 
                k *= r; 
  
                // gcd of p, k  
                long m = gcd(p, k); 
  
                // dividing by gcd, to simplify product  
                // division by their gcd saves from the overflow  
                p /= m; 
                k /= m; 
  
                n--; 
                r--; 
            } 
  
            // k should be simplified to 1  
            // as C(n, r) is a natural number  
            // (denominator should be 1 ) .  
        } else { 
            p = 1; 
        } 
  
        // if our approach is correct p = ans and k =1  
        System.out.println(p); 
    } 
  
    static long gcd(long n1, long n2){
        if(n2==0){
            return n1;
        }else{
            return gcd(n2,n1%n2);
        }
    }
    
    
    
    /*
    this two functions gives worng ans....
    
    private static void nCr(int n, int r) {
        long a=fact(n)/fact(n-r)*fact(r);
        System.out.println(""+a);
    }

    private static long fact(int n) {
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }*/
}
