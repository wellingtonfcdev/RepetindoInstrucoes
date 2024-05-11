

public class ForStructure {
    public static void main(String[] args) {
        int n = 7;
    int fatorial = 1;

    for(int i = 1; i <= n; i++){
        System.out.println("i: " + i + ", fatorial: " + fatorial);
        fatorial = fatorial * i;
    }
    System.out.println(fatorial);
    }
    
    
}
