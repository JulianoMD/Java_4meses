package exercises;
import java.util.Scanner;

public class ExWhile1 {
	public static void main(String[] args) {
		/*
		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero: ");
			int x = sc.nextInt();
			if (x == 2002) {
				System.out.println("\nAcesso Permitido");
				break;
			}
		System.out.println("\nSenha Invalida");
		} while (true);
	}
}
