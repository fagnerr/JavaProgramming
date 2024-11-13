package javafundamentals;

import java.io.*;

public class PrintWriter {
	public static void main(String[] args) {
		try {
			PrintWriter writer = new PrintWriter("C:\\Dev\\github\\OracleJavaProgramming\\JavaFundamentals\\projeto-01.txt");//C:\dev\github\OracleJavaProgramming
			writer.print(
					"Fundamentos de Java (Java Fundamentals). Seção 7 Parte 1: Criando um Projeto de Inventário\n\n"
					+ "Este projeto vai conduzi-lo ao longo das Seções 4, 5, 6 e 7 do curso. "
					+ "Após cada seção, outras etapas deverão ser concluídas até ser "
					+ "criado um aplicativo Java completo para manutenção de Inventário.\n"
					+ "Para cada parte, tome como base a parte anterior de modo que requisitos antigos e novos sejam atendidos.\n"
					+ "Inclua todas as partes em um pacote chamado Inventário.\n\n"
					+ "Crie um programa de inventário que possa ser usado para uma ampla gama de produtos (cds, dvds, software etc.).");
			writer.close();
			System.out.println("Successful");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
