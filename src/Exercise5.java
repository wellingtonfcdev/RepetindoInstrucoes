import java.util.Scanner;
 
public class Exercise5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
 
    if (numero == 0 || numero == 1) {
      System.out.println(1);
      return;
    }
 
    long fatorial = 1;
    for (int i = 2; i <= numero; i++) {
      fatorial *= i;
    }
    System.out.println(fatorial);
    scanner.close();
  }
}