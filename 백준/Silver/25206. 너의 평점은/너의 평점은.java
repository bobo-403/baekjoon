import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        double grade_sum = 0;
        double point_sum = 0;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String point = st.nextToken();
            if (point.equals("P"))
                continue;
            grade_sum += grade;
            point_sum += mul(grade, point);
        }

        System.out.println(point_sum / grade_sum);

    }

    public static double mul(double grade, String point) {
        String score[][] = { { "A+", "4.5" }, { "A0", "4.0" }, { "B+", "3.5" }, { "B0", "3.0" }, { "C+", "2.5" },
                { "C0", "2.0" }, { "D+", "1.5" }, { "D0", "1.0" }, { "F", "0.0" } };

        for (int i = 0; i < score.length; i++) {
            if (point.equals(score[i][0])) {
                return Double.parseDouble(score[i][1]) * grade;
            }
        }

        return 0;
    }

}