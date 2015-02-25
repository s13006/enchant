import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by s13006 on 15/02/06.
 */
public class D006 {
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

        int n = Integer.parseInt(hoge.nextToken());
        String t = hoge.nextToken();
        if (t.equals("km")) {
            n *= 1000 * 100 * 10;
        } else if(t.equals("m")) {
            n *= 100 * 10;
        } else if(t.equals("cm")) {
            n *= 10;
        }

        System.out.println(n);
    }
}
