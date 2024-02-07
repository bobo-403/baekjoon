import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int initial = 2;
        for (int i = 0; i < N; i++)
            initial = (initial * 2) - 1;

        bw.write(initial * initial + "\n");
        bw.flush();
        bw.close();
    }
}