package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int n1, n2, n3;

        // Exibe a introdução
        System.out.println("Números em ordem crescente\n");
        System.out.println("Digite 3 números inteiros diferentes.\n");

        // Entrada dos números
        System.out.print("Digite um número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite um número: ");
        n2 = scanner.nextInt();

        System.out.print("Digite um número: ");
        n3 = scanner.nextInt();

        // Exibe os números em ordem crescente
        System.out.println("\nA ordem crescente dos números é:");

        // Condições para determinar a ordem crescente dos números
        if ((n1 > n2) && (n2 > n3)) {
            System.out.printf("%d, %d, %d\n", n3, n2, n1);
        } else if ((n1 > n3) && (n2 > n3)) {
            System.out.printf("%d, %d, %d\n", n2, n3, n1);
        } else if ((n2 > n1) && (n1 > n3)) {
            System.out.printf("%d, %d, %d\n", n3, n1, n2);
        } else if ((n2 > n3) && (n3 > n1)) {
            System.out.printf("%d, %d, %d\n", n1, n3, n2);
        } else if ((n3 > n1) && (n1 > n2)) {
            System.out.printf("%d, %d, %d\n", n2, n1, n3);
        } else if ((n3 > n2) && (n2 > n1)) {
            System.out.printf("%d, %d, %d\n", n1, n2, n3);
        } else {
            // Se as condições acima não forem satisfeitas, significa que os números não são diferentes
            System.out.println("Digite números diferentes\n");
        }

        // Fechando o scanner após o uso
        scanner.close();
    }
}
