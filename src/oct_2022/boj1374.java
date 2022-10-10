package oct_2022;

import java.io.*;
import java.util.*;

public class boj1374 {



    //시작값 기준 정렬
    public static class Room{

        int idx;
        int start;
        int end;

        public Room(int idx, int start, int end) {
            this.idx = idx;
            this.start = start;
            this.end = end;
        }


    }

    public static int n;




    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        ArrayList<Room> list = new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int ans=0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());


            list.add(new Room(idx, start, end));


        }

        Collections.sort(list, new Comparator<Room>() {
            @Override
            public int compare(Room o1, Room o2) {
                if(o1.start==o2.start){
                    return  o1.end-o2.end;
                }
                return o1.start-o2.start;
            }
        });


        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            while(!pq.isEmpty()&&pq.peek()<=list.get(i).start){
                pq.poll();
            }
            //pq에는 객체를 넣어줄 필요가 없음 그냥 끝값만 넣어줘도 됨
            pq.add(list.get(i).end);

            //어차피 시작과 종료가 겹치는 애들이 생기면 원소가 큐에서 빠져나가니까
            //사실상 큐의 크기가 가장 클 때가 최소로 필요한 강의실의 개수가 될거임 (그림그려보면 됨)
            max=Math.max(max,pq.size());


        }

        System.out.println(max);








    }





}