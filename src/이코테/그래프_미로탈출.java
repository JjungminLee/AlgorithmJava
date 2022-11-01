package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_미로탈출 {
    public static int n;
    public static int m;
    public static int arr[][];
    public static boolean visit[][];

    public static int sum[][];
    public static int dx[]={-1,1,0,0};
    public static int dy[]={0,0,-1,1};

    public static int cnt=0;



    public static class Node{
        int x;
        int y;
        public Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static Queue<Node> queue=new LinkedList<>();


    public static void BFS(){

        while(!queue.isEmpty()){
            Node node=queue.poll();
            for(int i=0;i<4;i++){
                int nx= node.x+dx[i];
                int ny= node.y+dy[i];
                if(nx==n-1&&ny==m-1){
                    sum[nx][ny]=Math.min(sum[nx][ny],sum[node.x][node.y]+1);
                    return;
                }

                if(nx>=0&&nx<n&&ny>=0&&ny<m){
                    if(arr[nx][ny]==1&&!visit[nx][ny]){
                        visit[nx][ny]=true;
                        sum[nx][ny]=Math.min(sum[nx][ny],sum[node.x][node.y]+1);

                        queue.add(new Node(nx,ny));
                    }

                }
            }

        }




    }






    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        arr=new int[n][m];
        visit=new boolean[n][m];
        sum=new int[n][m];

        for(int i=0;i<n;i++){
            String str=sc.next();
            for(int j=0;j<m;j++){
                arr[i][j]=str.charAt(j)-'0';
                visit[i][j]=false;
                sum[i][j]=Integer.MAX_VALUE;

            }
        }
        queue.add(new Node(0,0));
        visit[0][0]=true;
        sum[0][0]=1;
        BFS();
        System.out.println(sum[n-1][m-1]);





    }
}
