package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 그리디_1이될때까지 {

    public static int n;
    public static int k;

    public static int ans=0;

    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        while(n!=1){
            if(n%k==0){
                n/=k;
                ans++;
            }else{
                n-=1;
                ans++;
            }
        }

        System.out.println(ans);


    }
}
