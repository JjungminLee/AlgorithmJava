package 이코테.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 정렬_두배열원소교체 {
    public static int n;
    public static int k;

    public static Integer[]a;
    public static Integer[]b;







    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        a=new Integer[n];
        b=new Integer[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){

            a[i]=Integer.parseInt(st.nextToken());

        }

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            b[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());



        for(int i=0;i<k;i++){
            if(a[i]<b[i]){
                //b[i]가 더 크면 교체
                a[i]=b[i];
            }else{
                break; //아니면 탈출하기 --> 왜 이걸 생각 못했지??!
            }
        }



        int sum=0;

        for(int i=0;i<n;i++){
            sum+=a[i];
        }

        System.out.println(sum);







    }

}
