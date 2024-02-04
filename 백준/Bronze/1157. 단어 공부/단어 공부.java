import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int small = 'a';
        int large = 'A';
        int alphabet[] = new int['Z' - 'A' + 1];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= small)
                alphabet[word.charAt(i) - small]++;
            else
                alphabet[word.charAt(i) - large]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                ch = '?';
            }

        }

        System.out.println(ch);

    }

}