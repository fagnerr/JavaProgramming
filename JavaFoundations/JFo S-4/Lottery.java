package teste;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();

			System.out.print("Informe um número entre 1 e 18: ");
			int userNumber = scanner.nextInt();

			while (userNumber < 1 || userNumber > 18) {
			    System.out.println("Número inválido. Informe um número entre 1 e 18:");
			    userNumber = scanner.nextInt();
			}

			int winningNumber = random.nextInt(18) + 1;

			System.out.println("Seu número: " + userNumber);
			System.out.println("O número vencedor é: " + winningNumber);

			if (userNumber == winningNumber) {
			    System.out.println("Parabéns! Você ganhou!");
			} else {
			    System.out.println("Que pena! Tente novamente.");
			}
		}
    }
}