/*problem: https://www.codechef.com/problems/HRDSEQ */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sn=new Scanner(System.in);
	    int t=sn.nextInt();
	    for (int ii=0;ii<t ;ii++ ){
	        int n=sn.nextInt();//4
	        int arr[]={0,0,1,0,2,0,2,2,1,6,0,5,0,2,6,5,4,0,5,3,0,3,2,9,0,4,9,3,6,14,0,6,3,5,15,0,5,3,5,2,17,0,6,11,0,3,8,0,3,3,1,42,0,5,15,20,0,4,32,0,3,11,18,0,4,7,0,3,7,3,2,31,0,6,31,3,6,3,2,8,33,0,9,56,0,3,8,7,19,0,5,37,0,3,8,8,1,46,0,6,23, 0 ,3 ,9,21, 0, 4, 42, 56, 25, 0, 5, 21, 8, 18, 52, 0, 6, 18, 4, 13, 0, 5, 11, 62, 0 ,4, 7, 40, 0};
	        //create the Sequence 0 0 1 0 
	        
	        int indx=n-1;
	        int count=0;
	        for(int i=indx;i>=0;i--){
	            if(arr[indx]==arr[i]){
	                count++;
	            }
	        }
	        System.out.println(count);
	    }  
	}
}