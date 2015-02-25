import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D009 {
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
        int o = Integer.parseInt(hoge.nextToken());
        int n = Integer.parseInt(hoge.nextToken());
        System.out.println(n - o);
    }
}
