import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> al = new ArrayList<>();
        String input;

        try {
            input = br.readLine();
            int N = Integer.parseInt(input);

            for (int i = 0; i < N; i++) {
                input = br.readLine();
                int loc = 0;
                boolean dup = false;
                for (; loc < al.size(); loc++) {
                    String str = al.get(loc);
                    if (input.length() > str.length()) {
                        continue;
                    } else if (input.length() == str.length()) {
                        if (input.compareTo(str) > 0) {
                            continue;
                        } else if (input.compareTo(str) == 0) {
                            dup = true;
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!dup)
                    al.add(loc, input);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : al)
            System.out.println(s);
    }
}
