import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //空白で区切る
        StringTokenizer hoge = new StringTokenizer(line, " ");
        int a = Integer.parseInt(hoge.nextToken());
        int b = Integer.parseInt(hoge.nextToken());
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("eq");
        }
    }
}
