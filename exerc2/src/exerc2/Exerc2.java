
package exerc2;

import java.util.ArrayList;
import java.util.Scanner;


public class Exerc2 {

  
    public static void main(String[] args) {
             // Criação de um Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in);
        
        // Criação do ArrayList com os nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");
        
        // Exibindo a lista inicial
        System.out.println("Lista inicial de nomes:");
        System.out.println(nomes);
        
        // Pedindo ao usuário um nome para remover
        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeRemover = scanner.nextLine();
        
        // Removendo o nome se ele existir na lista
        if (nomes.contains(nomeRemover)) {
            nomes.remove(nomeRemover);
            System.out.println("\nNome removido com sucesso.");
        } else {
            System.out.println("\nNome não encontrado na lista.");
        }
        
        // Exibindo a lista atualizada
        System.out.println("\nLista atualizada de nomes:");
        System.out.println(nomes);
        
        // Fechar o scanner
        scanner.close();
    }
}