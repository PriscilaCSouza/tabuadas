import java.util.Scanner;

public class SelecaoTabuada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Prezado(a) usuário(a), informe o número da tabuada que deseja:");
		
		int numero = teclado.nextInt();
		
		for(int contador=1; contador<=10; contador++) {
			System.out.println(numero+"x"+contador+"="+numero*contador);
		}

		teclado.close();	
	}

}
