import java.util.Scanner;

public class Modul3Nivell3 {
	public static void main(String[] args) {
		
		Scanner introdueix = new Scanner(System.in);
		int inici=0, a=1, n, num;
		
		System.out.println("Introdueix un n�mero : ");
		num=introdueix.nextInt();
		System.out.println("La seq��ncia del fibonacci del n�mero "+num+" �s:");
		for(int i=0;i<num;i++) {
			System.out.println(inici);
			n = inici+a;
			inici = a;
			a=n;
		
		
		}
	
	introdueix.close();
	}
}
