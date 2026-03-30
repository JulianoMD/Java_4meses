package src.basicComands;

import javax.swing.JOptionPane;

public class JoptionPane {
	public static void main(String args[]) {
		String filme = JOptionPane.showInputDialog("Qual o seu filme favorito?");
		String texto = JOptionPane.showInputDialog("Digite um numero");
		int numero = Integer.parseInt(texto);
		numero *= 10;
		JOptionPane.showMessageDialog(null, "Filme favorito: " + filme + "\nNumero digitado: " + numero);
	}
}
