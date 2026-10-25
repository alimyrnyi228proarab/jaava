import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int count = 0;

        for (int x = 0; x <= 1000; x++) {
            if (x == e) {
                continue;
            }

            long result = (long) a * x * x * x
                    + (long) b * x * x
                    + (long) c * x + d;

            if (result == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}