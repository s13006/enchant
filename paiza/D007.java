import java.util.Scanner;

/**
 * Created by s13006 on 15/02/06.
 */
public class D007 {
  public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
      int n = stdIn.nextInt();
      String ast = "";
      for (int i = 0; i < n; i++) {
          ast += "*";
      }
      System.out.println(ast);
  }
}
