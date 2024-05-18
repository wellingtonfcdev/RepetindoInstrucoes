import java.util.Scanner;
 
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;
 
        while (true) {
            int numero = scanner.nextInt();
 
            if (numero < 0) {
                break;
            }
 
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
 
        System.out.println(maiorNumero);
        scanner.close();
    }
}