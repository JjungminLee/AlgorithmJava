package 이코테.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 그리디_큰수의법칙 {

    public static int n;
    public static int m;
    public static int k;
    public static Integer[]arr;

    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        arr=new Integer[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int num=0;
        int ans=0;

        while(num!=m){
            for(int i=0;i<k;i++){
                ans+=arr[0];
                num++;

            }
            ans+=arr[1];
            num++;

        }

        System.out.println(ans);



    }
}
