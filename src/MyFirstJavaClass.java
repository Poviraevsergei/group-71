import java.util.Scanner;

public class MyFirstJavaClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 100){
            for (int i = num; i <= 100; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }

        if (true){
            System.out.println("Hello git");
        }
    }
}
