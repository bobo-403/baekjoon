import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> sortedNum = new ArrayList<>();
        HashMap<Integer, Integer> index = new HashMap<>();
        try {
            int n = Integer.parseInt(br.readLine());
            int[] num = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(st.nextToken());
                sortedNum.add(num[i]);

            }

            Collections.sort(sortedNum);
            int rank = 0;
            for (int i = 0; i < sortedNum.size(); i++) {
                if (index.get(sortedNum.get(i)) != null)
                    continue;
                index.put(sortedNum.get(i), rank);
                rank++;
            }

            for (int i = 0; i < n; i++)
                bw.write(index.get(num[i]) + " ");

            bw.close();

        } catch (IOException e) {

        }
    }
}