import java.util.Scanner;
public class ACprimos{
	public static void main(String []args){
		int n = 0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("valor n ");
		n=entrada.nextInt();
		Nprimos primos=new Nprimos(n);
		System.out.println(n+primos.numerosPrimos());
	}
}