package oct_2022;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class boj1057 {

    public static int n;
    public static int a;
    public static int b;


    public static int ans=0;

    public static int arr[][];




    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        //둘이 같은 그룹에 있을 때 멈춰야 함.
        arr=new int[n+1][2];
        for(int i=1;i<=n;i++){
            arr[i][0]=i;
            arr[i][1]=i;
        }

        while(arr[a][1]!=arr[b][1]){
            for(int i=1;i<=n;i++){
                //같은 그룹이 된다.
                // 1,2 는 시합하고 나서 같은 1이라는 그룹이 됨
                // 결국 (1+1)/2== (2+1)/2
                arr[i][1]=(arr[i][1]+1)/2;
            }
            ans++;

        }

        System.out.println(ans);



    }

}