import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String word;

        for (int i = 0; i < n; i++) {
            word = br.readLine();
            if (is_group(word))
                count++;
        }

        System.out.println(count);

    }

    public static boolean is_group(String str) {
        int exist[] = new int['z' - 'a' + 1];

        for (int i = 0; i < str.length(); i++) {
            if (exist[str.charAt(i) - 'a'] == 1)
                if (str.charAt(i) == str.charAt(i - 1))
                    continue;
                else
                    return false;
            exist[str.charAt(i) - 'a'] = 1;
        }

        return true;
    }

}