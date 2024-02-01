import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int origin[] = { 1, 1, 2, 2, 2, 8 };
        int mine[] = new int[origin.length];

        for (int i = 0; i < mine.length; i++)
            mine[i] = scanner.nextInt();

        int result[] = compare_chess(origin, mine);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");

    }

    public static int[] compare_chess(int[] origin, int mine[]) {
        int result[] = new int[origin.length];

        for (int i = 0; i < origin.length; i++)
            result[i] = origin[i] - mine[i];

        return result;
    }
}