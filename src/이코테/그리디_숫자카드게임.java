package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 그리디_숫자카드게임 {

    public static int n;
    public static int m;

    public static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n][m];


        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());


            }
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            int min=100000;
            for(int j=0;j<m;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            list.add(min);
        }

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list.get(0));
    }
}
