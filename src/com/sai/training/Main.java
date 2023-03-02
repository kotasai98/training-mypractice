import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("int a:" );
        a = sc.nextInt();
        System.out.println("int b:");
        b= sc.nextInt();

        if(a>b) {
            System.out.println("A is larger");
        }else if(b>a) {
            System.out.println("B is larger");
        }else{
            System.out.println("A and B are equal");
        }
    }
}