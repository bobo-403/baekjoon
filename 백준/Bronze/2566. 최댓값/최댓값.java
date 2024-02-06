import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int array[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++)
                array[i][j] = Integer.parseInt(st.nextToken());
        }
        int row = 0, column = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                if (array[row][column] < array[i][j]) {
                    row = i;
                    column = j;
                }
        }

        bw.write(array[row][column] + "\n");
        bw.write((row + 1) + " " + (column + 1));

        bw.flush();
        bw.close();

    }

}