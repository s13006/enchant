import java.util.Scanner;

public class D008 {
  public static void main(String[] args){
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        if(n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
