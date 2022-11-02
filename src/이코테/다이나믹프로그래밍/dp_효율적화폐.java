package 이코테.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_효율적화폐 {
    public static int n;
    public static int m;

    public static int[] arr;

    public static int dp[];







    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n];
        dp=new int[m+1];

        for(int i=1;i<=m;i++){

            dp[i]=10001;
        }

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]<=m){
                dp[arr[i]]=1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=arr[i];j<=m;j++){ //arr[i]부터 시작하는게 핵심이였음...!
                dp[j]=Math.min(dp[j],dp[j-arr[i]]+1);
            }
        }

        System.out.println(dp[m]);













    }
}
