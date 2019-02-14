import java.util.Scanner;

public class RecursiveMethod {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int n = key.nextInt();
        n=x(n);
        System.out.println(n);
        }
    public static int x(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        else {
            return x(n-1) + x(n-2);
        }
    }
}
