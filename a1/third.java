import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i * i <= b; i++) {
            int square = i * i;

            if (square >= a) {
                System.out.print(square + " ");
            }
        }
    }
}