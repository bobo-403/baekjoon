import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int array_1[][] = new int[n][m];
        int array_2[][] = new int[n][m];
        String input;

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            StringTokenizer stt = new StringTokenizer(input);
            for (int j = 0; j < m; j++)
                array_1[i][j] = Integer.parseInt(stt.nextToken());
        }

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            StringTokenizer stt = new StringTokenizer(input);
            for (int j = 0; j < m; j++)
                array_2[i][j] = Integer.parseInt(stt.nextToken());
        }

        int[][] result = sum_array(array_1, array_2, n, m);
        print_array(result, n, m);

    }

    public static int[][] sum_array(int[][] a, int[][] b, int n, int m) {
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    public static void print_array(int[][] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}