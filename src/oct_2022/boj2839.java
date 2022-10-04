package oct_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj2839 {

    public static int n;
    public static int five=0;
    public static int three=0;
    public static int ans=0;




    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(br.readLine());

        while(n!=0){
            if(n<0){
                ans=-1;
                break;
            }

            if((n/5)/3>=1 || n%5==0){
                five++;
                n-=5;

            }else if(n%3==0){

                three++;
                n-=3;

            }else{
                n-=5;
                five++;
            }
        }
        if(ans==-1){
            System.out.println(ans);
        }else{
            System.out.println(five+three);
        }



















    }

}