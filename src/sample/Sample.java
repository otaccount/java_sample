package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {
    public void Test01(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String token1 = sc.next();
            String token2 = sc.next();
            System.out.println("hello = " + token1 + " , world = " + token2);
        }
    }

    public void Test02(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        System.out.println(N + str);
    }

    public void Test03(){
        Scanner sc = new Scanner(System.in);

        int a, b = 0;
        int n = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();

        var list = new ArrayList<int[]>();
        for(var i=0;i<n;i++){
            list.add(new int[]{sc.nextInt(), sc.nextInt()});
        }

        for (int[] ints : list) {
            if(ints[0] < a){
                System.out.println("High");
            }else if(ints[0] > a){
                System.out.println("Low");
            }else{
                if(ints[1] > b){
                    System.out.println("High");
                }else{
                    System.out.println("Low");
                }
            }
        }
    }
}
