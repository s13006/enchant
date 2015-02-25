import java.util.Scanner;

public class D011 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String a = stdIn.next();
        for (int i = 0; i < alfa.length(); i++) {
            if (alfa.substring(i,i+1).equals(a)) {
                System.out.println(i + 1);
            }
        }
    }
}
