import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String num = change_num(str);
        int time = taken_time(num);

        System.out.println(time);

        scanner.close();
    }

    public static String change_num(String str) {
        String num = "";
        int c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            c -= 'A';
            if (c >= 0 && c < 3)
                num += "2";
            else if (c >= 3 && c < 6)
                num += "3";
            else if (c >= 6 && c < 9)
                num += "4";
            else if (c >= 9 && c < 12)
                num += "5";
            else if (c >= 12 && c < 15)
                num += "6";
            else if (c >= 15 && c < 19)
                num += "7";
            else if (c >= 19 && c < 22)
                num += "8";
            else if (c >= 22 && c < 26)
                num += "9";
            else
                num += "0";
        }
        return num;
    }

    public static int taken_time(String num) {
        int time = 0;
        int n;
        for (int i = 0; i < num.length(); i++) {
            n = num.charAt(i) - '0';
            if (n == 0)
                n = 10;
            time += n + 1;
        }
        return time;
    }

}