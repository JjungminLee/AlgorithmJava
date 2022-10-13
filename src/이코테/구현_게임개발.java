package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구현_게임개발 {

    public static int n;
    public static int m;
    public static int a;
    public static int b;
    public static int dir;
    public static int[][] arr;
    public static boolean[][] visit;

    public static int[] dirX={-1,1,0,0};
    public static int[] dirY={0,0,-1,1};

    public static int count=0;

    public static int ans=0;
    public static void DFS(int a,int b,int dir,int count){

        int fourDir=0;

        for(int i=0;i<4;i++){
            int nA=a+dirX[i];
            int nB=b+dirY[i];

            if(nA>=0&&nA<n&&nB>=0&&nB<m){

                if(!visit[nA][nB]&&arr[nA][nB]!=1){

                    visit[nA][nB]=true;
                    count+=1;
                    ans=Math.max(ans,count);

                    DFS(nA,nB,dir,count);
                }else if(visit[nA][nB]&&arr[nA][nB]!=1){
                    fourDir++;

                }


            }
        }
        if(fourDir==4){
            //네방향 모두 가봤는데 바다는 아닌 경우

            count+=1;
            if(dir==1){
                a-=1;
            }else if(dir==-1){
                b+=1;
            }else if(dir==-2){
                a+=1;
            }else{
                b-=1;
            }
            DFS(a,b,dir,count);
        }



        return;

    }


    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n][m];
        visit=new boolean[n][m];

        st=new StringTokenizer(br.readLine());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        dir=Integer.parseInt(st.nextToken());


        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());


            }
        }
        DFS(a,b,dir,count);

        System.out.println(ans);






    }
}
