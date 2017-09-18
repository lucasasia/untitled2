import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String name;
        int a,b;
        System.out.print("請輸入a=");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("請輸入b=");
        b=sc.nextInt();
        if(a==b) {
            System.out.println(a+"="+b);
        }
        if(a!=b) {
            System.out.println(a+"!="+b);
        }
	}
}
