package 이코테.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 정렬_성적낮은순서대로출력 {
    public static int n;
    public static int arr[];



    public static class Member{
        String name;
        int score;

        public Member(String name,int score){
            this.name=name;
            this.score=score;
        }

    }

    public static ArrayList<Member> list=new ArrayList<>();
    public static ArrayList<String>ans=new ArrayList<>();






    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            String name=sc.next();
            int score=sc.nextInt();
            list.add(new Member(name,score));

        }

        Collections.sort(list,new Comparator<Member>(){
            @Override
            public int compare(Member o1, Member o2) {
                return o1.score-o2.score;
            }


        });

        for(int i=0;i<n;i++){
            System.out.println(list.get(i).name);
        }






    }
}
