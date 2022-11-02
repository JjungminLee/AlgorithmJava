package 이코테.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이진탐색_부품찾기 {
    public static int arr[];

    public static String binarySearch(int[] arr,int target){

        int first=0;
        int last=arr.length-1;
        int mid;

        while(first<=last){
            mid=(first+last)/2;

            if(arr[mid]==target){
                return "yes";
            }
            else if(arr[mid]>target){
                last=mid-1;
            }else{
                first=mid+1;
            }



        }

        return "no";





    }







    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = "";

        // 2 3 7 8 9


        while((input=br.readLine())!=null&& !input.isEmpty()){ //EOF처리



            int num=Integer.parseInt(input);
            arr=new int[num];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<num;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            // 2 3 7 8 9

            int k=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<k;i++){
                int target=Integer.parseInt(st.nextToken());
                System.out.print(binarySearch(arr,target)+" ");
            }



        }


    }

}
