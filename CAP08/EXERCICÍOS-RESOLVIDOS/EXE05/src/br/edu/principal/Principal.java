package br.edu.principal;

import java.util.Scanner;
import java.util.Arrays; // Importar a classe Arrays para ordenação

public class Principal {

    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int n1, n2, n3, n4;

        // Exibe a introdução
        System.out.println("Números em ordem decrescente\n");
        System.out.println("Digite três números em ordem CRESCENTE.\n");

        // Entrada dos números em ordem crescente
        System.out.print("Digite um número: ");
        n1 = scanner.nextInt(); // Menor número
        System.out.print("Digite um número: ");
        n2 = scanner.nextInt();
        System.out.print("Digite um número: ");
        n3 = scanner.nextInt(); // Maior número

        // Entrada do número fora da ordem
        System.out.print("Digite um número fora da ordem: ");
        n4 = scanner.nextInt();
        System.out.println();

        // Coloca os números em um array para ordenação
        int[] numeros = {n1, n2, n3, n4};

        // Ordena o array em ordem decrescente
        Arrays.sort(numeros); // Ordena em ordem crescente
        // Agora, invertemos a ordem para decrescente
        System.out.println("A ordem decrescente dos números é:");
        for (int i = 3; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Fechando o scanner após o uso
        scanner.close();
    }
}
