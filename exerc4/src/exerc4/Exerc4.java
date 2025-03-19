
package exerc4;

import java.util.ArrayList;
import java.util.Scanner;


public class Exerc4 {

  
    public static void main(String[] args) {
         // Criação de um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criação de um ArrayList de nomes de produtos
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Óleo");
        produtos.add("Açúcar");
        
        // Exibindo a lista de produtos
        System.out.println("Lista de produtos disponíveis:");
        System.out.println(produtos);
        
        // Pedindo ao usuário para digitar o nome do produto a ser buscado
        System.out.print("\nDigite o nome do produto para verificar se está na lista: ");
        String produtoBusca = scanner.nextLine();
        
        // Verificando se o produto está na lista
        if (produtos.contains(produtoBusca)) {
            System.out.println("\nProduto encontrado: " + produtoBusca);
        } else {
            System.out.println("\nProduto não encontrado.");
        }
        
        // Fechar o scanner
        scanner.close();
    }
}