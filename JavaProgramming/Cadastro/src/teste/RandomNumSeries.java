package teste;

import java.util.Random;

public class RandomNumSeries {
    public static void main(String[] args) {
        // Cria um objeto da classe Random para gerar números aleatórios
        Random num = new Random();

        // Gera e imprime 5 números aleatórios
        System.out.println("Número Aleatório 1: " + num.nextInt());
        System.out.println("Número Aleatório 2: " + num.nextInt());
        System.out.println("Número Aleatório 3: " + num.nextInt());
        System.out.println("Número Aleatório 4: " + num.nextInt());
        System.out.println("Número Aleatório 5: " + num.nextInt());
    }
}