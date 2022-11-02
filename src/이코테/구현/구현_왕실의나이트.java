package 이코테.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구현_왕실의나이트 {

    public static int[] dirX={-2,2,-1,1};
    public static int[] dirY={-1,1,-2,2};

    public static int ans=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        char c=s.charAt(0);
        int x=(int)c-96;
        int y=Character.getNumericValue(s.charAt(1));

        for(int i=0;i<4;i++){
            int nx=x+dirX[i];
            int ny=y+dirY[i];
            if(nx>=1&&nx<=8&&ny>=1&&ny<=8){
                ans++;

            }
        }

        System.out.println(ans);
    }
}
