import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int number = 1;

        while (count < n) {
            for (int i = 0; i < number && count < n; i++) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}