import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int n = N % B;
            N = N / B;
            if (n > 9)
                sb.append((char) (n - 10 + 'A'));
            else
                sb.append((char) (n + '0'));
        }
        sb.reverse();

        System.out.println(sb);

    }
}