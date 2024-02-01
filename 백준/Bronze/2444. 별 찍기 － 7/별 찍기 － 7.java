import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 2 * n - 1;
        int level = 1;

        while (level <= max) {
            print_star(max, level);
            level++;
        }
    }

    public static void print_star(int max, int level) {
        if (max < 2 * level)
            level = max - level + 1;
        int star = 2 * level - 1;
        int blank = (max - star) / 2;
        for (int i = 0; i < blank; i++)
            System.out.print(" ");
        for (int i = 0; i < star; i++)
            System.out.print("*");
        System.out.println();

    }

}