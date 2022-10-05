package oct_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj2075 {

    public static int n;
    public static int arr[][];

    public static class Node implements Comparable<Node>{

        int x;
        public Node(int x){
            this.x=x;
        }

        @Override
        public int compareTo(Node other){
            return this.x<= other.x?1:-1;
        }
    }

    public static PriorityQueue<Node> priorityQueue=new PriorityQueue<>();





    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        arr=new int[n][n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                priorityQueue.offer(new Node(Integer.parseInt(st.nextToken())));

            }

        }
        List<Integer> list=new ArrayList<>();

        while(!priorityQueue.isEmpty()){
            list.add(priorityQueue.poll().x);
        }

        System.out.println(list.get(n-1));







    }
}
