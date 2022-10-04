package oct_2022;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj2887 {

    public static class Point{
        int idx;

        int x;
        int y;
        int z;
        public Point(int idx,int x,int y,int z){
            this.idx=idx;
            this.x=x;
            this.y=y;
            this.z=z;
        }
    }

    public static class Line implements Comparable<Line>{
        //to from이 집합

        int to;
        int from;
        int cost;
        public Line(int to,int from,int cost){

            this.to=to;
            this.from=from;
            this.cost=cost;

        }

        @Override
        public int compareTo(Line other){
            return  this.cost-other.cost;
        }


    }

    public static int n;

    public static int ans=0;

    public static int[] parents;

    public static void union(int x,int y){
        x=find(x); //부모를 찾아내야함
        y=find(y);
        if(x<y){
            parents[y]=x;
        }else{
            parents[x]=y;
        }

    }

    public static int find(int x){
        if(parents[x]==x){
            return x;
        }
        return parents[x]=find(parents[x]);

    }





    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        parents=new int[n];

        List<Line> list=new ArrayList<>();
        Point arr[]=new Point[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            arr[i]=new Point(i,a,b,c); //집합 idx 붙여줘야 함!
        }

        //x를 기준으로 정렬

        Arrays.sort(arr,(o1,o2)->o1.x-o2.x);
        for(int i=0;i<n-1;i++){
            int cost=Math.abs(arr[i].x-arr[i+1].x);
            list.add(new Line(arr[i].idx,arr[i+1].idx,cost));
        }

        Arrays.sort(arr,(o1,o2)->o1.y-o2.y);
        for(int i=0;i<n-1;i++){
            int cost=Math.abs(arr[i].y-arr[i+1].y);
            list.add(new Line(arr[i].idx,arr[i+1].idx,cost));
        }

        Arrays.sort(arr,(o1,o2)->o1.z-o2.z);
        for(int i=0;i<n-1;i++){
            int cost=Math.abs(arr[i].z-arr[i+1].z);
            list.add(new Line(arr[i].idx,arr[i+1].idx,cost));
        }

        Collections.sort(list);

        //유니온 파인드

        for(int i=0;i<n;i++){
            parents[i]=i;
        }

        for(int i=0;i<list.size();i++){

            //만약에 갔다온 집합이라면 사이클이 발생할 경우임
            if(find(list.get(i).to)!=find(list.get(i).from)){
                union(list.get(i).to,list.get(i).from); //union -> parents 바꿔주기
                ans+=list.get(i).cost;

            }


        }

        System.out.println(ans);




    }

}