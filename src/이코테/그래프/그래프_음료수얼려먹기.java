package 이코테.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 그래프_음료수얼려먹기 {

    public static int n;
    public static int m;
    public static int arr[][];
    public static boolean visit[][];
    public static int dx[]={-1,1,0,0};
    public static int dy[]={0,0,-1,1};

    public static int sum=0;

    public static void DFS(int i,int j){






        if(i<0||i>=n||j<0||j>=m){
            return;
        }
        if(arr[i][j]==0){
            arr[i][j]=1;//굳이 visit을 쓰지 않아도 된다?!

            for(int k=0;k<4;k++){
                int nx=i+dx[k];
                int ny=j+dy[k];
                DFS(nx,ny);
            }
        }





    }




    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=new StringTokenizer(br.readLine());
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n][m];
        visit=new boolean[n][m];

        for(int i=0;i<n;i++){
            String str=sc.next();

            for(int j=0;j<m;j++){
                arr[i][j]=str.charAt(j)-'0';
                visit[i][j]=false;

            }
        }


        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){




                if(arr[i][j]==0){
                    DFS(i,j);
                    sum++;
                }

            }
        }

        System.out.println(sum);






    }

}
