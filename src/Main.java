import java.io.Console;
import java.util.*;
public class Main {
    public static void main(String[] args) {

    }

    private static void Test02(){
        System.out.println("Hello World");

        var list = new ArrayList<String>();
        for(var i=0;i<10;i++){
            list.add(String.valueOf(i));
        }

        list.forEach(x -> System.out.println(x));
    }
    private static void Test01(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        var str = sc.next();

        System.out.println(String.format("%d %s", N, str));
    }
}