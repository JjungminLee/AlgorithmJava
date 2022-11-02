package 이코테.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이진탐색_떡볶이떡 {
    public static int n;
    public static int m;

    public static int arr[];







    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){

            arr[i]=Integer.parseInt(st.nextToken());
        }

        // 10 15 17 19


        Arrays.sort(arr);
        int first=0;
        int last=arr[n-1];
        int mid=0;

        while(first<=last){




            mid=(first+last)/2;



            int sum=0;

            for(int i=0;i<n;i++){
                if(arr[i]<mid){
                    sum+=0;
                }
                else{
                    sum+=arr[i]-mid;
                }
            }




            if(sum>m) {
                first = mid + 1;

            }
            else{
                last=mid-1;
            }


        }

        System.out.println(mid);






    }
}
