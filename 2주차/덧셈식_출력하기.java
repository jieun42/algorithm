import java.util.Scanner;

public class 덧셈식_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = a + b;

        System.out.printf("%d + %d = %d", a, b, answer);
    }
}