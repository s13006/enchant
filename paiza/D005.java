import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by s13006 on 15/02/06.
 */
public class D005 {
  public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //空白で区切る
        StringTokenizer hoge = new StringTokenizer(line, " ");

        int start = Integer.parseInt(hoge.nextToken());
        int sa = Integer.parseInt(hoge.nextToken());

        for (int i = 0; i < 10; i++) {
            System.out.print(start + (sa * i));
            if(i != 10 - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
