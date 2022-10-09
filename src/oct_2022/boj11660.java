package oct_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj11660 {
    public static int n;
    public static int m;
    public static int arr[][];
    public static int dp[][];


    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            dp[i][1] = dp[i - 1][1] + arr[i][1];
        }
        for (int i = 1; i <= n; i++) {
            dp[1][i] = dp[1][i - 1] + arr[1][i];
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i][j];
            }
        }

//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=4;j++){
//                System.out.println(i+" "+j+" "+dp[i][j]);
//            }
//        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());


            int ans = dp[x2][y2] - dp[x1][y1] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1] + dp[x1][y1 - 1] + arr[x1][y1];
            list.add(ans);

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
