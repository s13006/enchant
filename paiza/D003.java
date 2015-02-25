import java.util.Scanner;

public class D003 {
  public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for (int i = 1; i < 9; i++) {
            int a = n * i;
            System.out.print(a + " ");
        }
        System.out.println(n * 9);
    }
}
