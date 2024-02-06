import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        int i = 0, max = 0;
        char ch[][] = new char[5][];
        while ((input = br.readLine()) != null) {
            ch[i] = new char[input.length()];
            if (max < input.length())
                max = input.length();
            for (int j = 0; j < ch[i].length; j++)
                ch[i][j] = input.charAt(j);
            i++;
        }

        vertical_print(ch, max);

    }

    public static void vertical_print(char[][] arr, int max) {

        for (int i = 0; i < max; i++)
            for (int j = 0; j < arr.length; j++)
                if (i < arr[j].length)
                    System.out.print(arr[j][i]);

    }

}