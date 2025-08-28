package ti2.exercicio1;

import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		
		// Declarando variaveis
		int num1, num2, soma = 0;
		
		// Recebendo primeiro num
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		
		// Recebendo segundo num
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		
		// Soma
		soma = num1 + num2;
		
		// Mostrar resultado
		System.out.println("Soma: " + soma);
	}
}
