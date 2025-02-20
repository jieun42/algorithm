import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        
        for (int i=0;i<a.length();i++) {
            b = a.charAt(i);
            if (Character.isUpperCase(b)) {
                answer += Character.toLowerCase(b);
            } else {
                answer += Character.toUpperCase(b);
            }
        }
        
        System.out.print(answer);

        sc.close();
    }
}