package teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gerador  {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Em qual ano você está?");

		int ano = leitor.nextInt();

		switch (ano) {
		    case 9:
		        System.out.println("Você está no primeiro ano.");
		        break;
		    case 10:
		        System.out.println("Você está no segundo ano.");
		        break;
		    case 11:
		        System.out.println("Você está no terceiro ano.");
		        break;
		    case 12:
		        System.out.println("Você está no quarto ano.");
		        break;
		    default:
		        System.out.println("Ano inválido.");
		}
		// Fragmento 1
		String inputString = JOptionPane.showInputDialog("??");
		int input = Integer.parseInt(inputString);
		input++;

		// Fragmento 2
		int input2 = Integer.parseInt(JOptionPane.showInputDialog("??")) + 1;
		 System.out.println(input);
		 System.out.println(input2);
	}

}
