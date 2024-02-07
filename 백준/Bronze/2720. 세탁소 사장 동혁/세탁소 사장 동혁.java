import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] unit = { 25, 10, 5, 1 };
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            for (int j = 0; j < unit.length; j++) {
                bw.write(C / unit[j] + " ");
                C = C % unit[j];
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}