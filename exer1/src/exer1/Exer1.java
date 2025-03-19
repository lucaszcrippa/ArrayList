
package exer1;

import java.util.ArrayList;
import java.util.Scanner;


public class Exer1 {

 
    public static void main(String[] args) {
       // Criação de um Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in);
        
        // Criação de um ArrayList de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Laço para adicionar 5 números ao ArrayList
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero); // Adicionando o número ao ArrayList
        }
        
        // Exibindo os números armazenados
        System.out.println("\nElementos armazenados no ArrayList:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        // Fechar o scanner
        scanner.close();
    }
}