package 이코테.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_개미전사 {


    public static int n;


    public static int arr[];
    public static int dp[];







    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        dp = new int[n];
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0]=arr[0];
        dp[1]=Math.max(dp[0],arr[1]);

        // dp[i]라는게 i까지 올 때까지 식량의 최대값을 말하는거

        for(int i=2;i<n;i++){
            //새로운걸 더하는게 더 큰지 아니면 이전꺼 그대로 가는게 더 큰지
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);

        }



        System.out.println();
        int max=0;
        for(int i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }

        System.out.println(max);

    }

}
