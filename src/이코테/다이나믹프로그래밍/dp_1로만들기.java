package 이코테.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_1로만들기 {
    public static int n;

    public static int dp[];







    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        dp=new int[n+1];

        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
        }

        dp[1]=0;
        dp[2]=1;
        dp[3]=1;

        for(int i=4;i<=n;i++){
            //1빼는거 먼저 생각하고
            dp[i]=dp[i-1]+1;

            //2로 나눠떨어지는 것부터 고려했어야
            //dp 자체를 잘 사용해보자! 매번 계산하는게 아니라!!
            if(i%2==0){
                dp[i]=Math.min(dp[i],dp[i/2]+1);
            }else if(i%3==0){
                dp[i]=Math.min(dp[i],dp[i/3]+1);
            }else if(i%5==0){
                dp[i]=Math.min(dp[i],dp[i/5]+1);
            }



        }

        System.out.println(dp[n]);





    }
}
