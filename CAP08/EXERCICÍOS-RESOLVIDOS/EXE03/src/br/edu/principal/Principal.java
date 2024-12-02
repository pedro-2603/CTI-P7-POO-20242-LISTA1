package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int n1, n2;

        // Exibe a introdução
        System.out.println("Descubra qual número é maior!\n");

        // Entrada dos números
        System.out.print("Digite um número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        n2 = scanner.nextInt();

        // Comparação dos números
        if (n1 > n2) {
            System.out.printf("%d é maior que %d\n", n1, n2);
        } else {
            System.out.printf("%d é maior que %d\n", n2, n1);
        }

        // Fechando o scanner após o uso
        scanner.close();
    }
}
