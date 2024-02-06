import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String B = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int n = 1;

        int res = 0;
        for (int i = B.length(); i > 0; i--) {
            if (B.charAt(i - 1) < 'A')
                res += n * (B.charAt(i - 1) - '0');

            else
                res += n * (B.charAt(i - 1) - 'A' + 10);
            n *= N;
        }
        bw.write(res + "\n");
        bw.close();
    }
}