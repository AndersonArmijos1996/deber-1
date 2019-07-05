import java.util.Scanner;
 
public class Fibonacci {
 
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        int a = 0, b = 1, c, n;
       
        System.out.print("Ingrese un numero por teclado: ");
        n = teclado.nextInt();
       
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}