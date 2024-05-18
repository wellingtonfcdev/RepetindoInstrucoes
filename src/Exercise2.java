import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
 
        System.out.println(soma);
 
        scanner.close();
    }
}
