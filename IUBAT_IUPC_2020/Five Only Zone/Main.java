import java.util.Scanner;

/**
 * IUBAT - IUPC - spring-2020
 * @author milon
 */
public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String n=sin.nextLine();
        
        //long s=System.currentTimeMillis();
        
        boolean ck=rearrange(n);
        boolean ck1=dropping(n);
        boolean ck2=summing(n);
        if(!ck && !ck1 && !ck2){//88,50,567,10,23
             System.out.println("NOT A FIVE ONLY ZONE");
        }
        
        //System.out.println("time: "+(s-(System.currentTimeMillis())));
    }
    
    //droping
    private static boolean dropping(String n) {
        if(n.length()>1){
            String newn=n.substring(0,n.length()-1);
            if(Long.valueOf(newn)%5==0){
               System.out.println("DROPPING");
               return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    //summing
    private static boolean summing(String n) {
        long sum=0;
        for (int i = 0; i < n.length(); i++) {
            sum+=Long.valueOf(n.charAt(i)+"");
        }
       
        if(sum%5==0){
            System.out.println("SUMMING");
            return true;
        }else{
            return false;
        }
        
        
    }
    //rearrenging
    private static boolean rearrange(String n){
        int[] cnt=new int[10];//0-9--- 550
        int size=n.length();
        
        for (int i = 0; i < size; i++) {
            switch (n.charAt(i)) {
                case '0':
                    cnt[0]+=1;
                    break;
                case '1':
                    cnt[1]+=1;
                    break;
                case '2':
                    cnt[2]+=1;
                    break;
                case '3':
                    cnt[3]+=1;
                    break;
                case '4':
                    cnt[4]+=1;
                    break;
                case '5':
                    cnt[5]+=1;
                    break;
                case '6':
                    cnt[6]+=1;
                    break;
                case '7':
                    cnt[7]+=1;
                    break;
                case '8':
                    cnt[8]+=1;
                    break;
                case '9':
                    cnt[9]+=1;
                    break;
                default:
                    break;
            }
        }
         
         long sum=0;
        
        //we have 5 in last     //234    
        if(n.contains("5")){
            long nfact=fact(size-1);// 3 = 3-2 =fact(2)=> 2
            long allmulti=1;
              for (int i = 0; i <= 9; i++) {
                  if(i==5){
                      if(cnt[i]>2){//5=2 ta takhle 1 ta jabe
                        allmulti*=fact(cnt[i]-1);
                      }
                  }else{
                      if(cnt[i]>1){//5=2
                         allmulti*=fact(cnt[i]);
                      }
                  }
              }
            //System.out.println("____5,mainfact="+nfact+" divfact="+allmulti+"="+(nfact/allmulti));
            sum+=nfact/allmulti;  
        }
        
        
        //we have 0 in last
        if(n.contains("0")){
            long nfact=fact(size-1);// 3 = 3-2 =fact(2)=> 2
            long allmulti=1;
              for (int i = 0; i <= 9; i++) {
                  if(i==0){
                      if(cnt[i]>2){//5=2 ta takhle 1 ta jabe
                        allmulti*=fact(cnt[i]-1);
                      }
                  }else{
                      if(cnt[i]>1){//5=2
                         allmulti*=fact(cnt[i]);
                      }
                  }
              }
            //System.out.println("0,mainfact="+nfact+" divfact="+allmulti+"="+(nfact/allmulti));
            sum+=nfact/allmulti;  
        }
        
        //System.out.println("sum="+sum);
        
        /////////////////////////remove zero////////////////////////
         long zero=0;
         //if we have zero then remove zero
            if(n.contains("0") && n.contains("5")){
                long zfact=fact(size-2);//-2 we have already fixed 2 position first as 0, last as 5
                long zmulti=1;
                //for 0 ____ 5
                for (int i = 0; i <= 9; i++) {
                    if(i==5){
                        if(cnt[i]>2){//5=3 ta 3-1 ta jabe
                          zmulti*=fact(cnt[i]-1);
                        }
                    }else if(i==0){
                        if(cnt[i]>2){//5=3 ta 3-1 ta jabe
                          zmulti*=fact(cnt[i]-1);
                        }
                    }else{
                        if(cnt[i]>1){//5=2
                           zmulti*=fact(cnt[i]);
                        }
                    }
                }
                //System.out.println("0___5,zfact="+zfact+" zmulti="+zmulti+"="+(zfact/zmulti));
                 zero+=(zfact/zmulti);
            }
            
            if(cnt[0]>1){
                long zfact=fact(size-2);//-2 we have already fixed 2 position first as 0, last as 5
                long zmulti=1;
                //for 0 ____ 0
                for (int i = 0; i <= 9; i++) {
                    if(i==0){
                        if(cnt[i]>2){//5=3 ta 3-1 ta jabe
                          zmulti*=fact(cnt[i]-2);
                        }
                    }else{
                        if(cnt[i]>1){//5=2
                           zmulti*=fact(cnt[i]);
                        }
                    }
                }
                //System.out.println("0___5,zfact="+zfact+" zmulti="+zmulti+"="+(zfact/zmulti));
                
                zero+=(zfact/zmulti);
               
            }
       //System.out.println("Zero="+zero);
            
        ////////////////////////////////////////////////////
        
        if((sum-zero)>0){
            System.out.println("REARRANGING: "+(sum-zero)+" Ways");
            return true;
        }else{
            return false;
        }
        
    }
    private static long fact(long n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    
}