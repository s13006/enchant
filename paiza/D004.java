import java.util.Scanner;

public class D004 {
  public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = stdIn.next();
        }
        System.out.print("Hello ");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i] + ".");
            } else {
                System.out.print(a[i] + ",");
            }
        }
    }
}
