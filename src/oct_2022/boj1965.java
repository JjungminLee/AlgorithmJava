package oct_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1965 {
    public static int n;
    public static int arr[];
    public static int dp[];








    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        arr=new int[n];
        dp=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //가장 긴 증가하는 부분 수열

        dp[0]=1;

        for(int i=1;i<n;i++){
            dp[i]=1;//우선은 기준이되는 애를 시작점으로 하는 수열 하나 만듦
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    //만약 앞에 기준이 되는 애보다 작은게 있다면 dp로 뽑아와주기
                    dp[i]=Math.max(dp[i],dp[j]+1); //1을 더하는 이유는 기준이 되는 애가 dp[j] 수열에서 뒤에 포함되기 때문!
                }
            }
        }


        int max=0;
        for(int i=0;i<n;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }

        System.out.println(max);




    }
}
