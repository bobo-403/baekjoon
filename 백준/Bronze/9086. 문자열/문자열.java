import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int T  = scanner.nextInt();
    String st[] = new String[T];

    for(int i=0; i<T; i++)
      st[i] = scanner.next();

    for(int i=0; i<T; i++){
      System.out.print(st[i].charAt(0));
      System.out.print(st[i].charAt(st[i].length() -1));
      System.out.println();
    }
  }
}