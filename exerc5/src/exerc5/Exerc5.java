
package exerc5;

import java.util.ArrayList;
import java.util.Scanner;


public class Exerc5 {

  
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        
        
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Salvador");
        cidades.add("Curitiba");
        
       
        System.out.println("Lista inicial de cidades:");
        System.out.println(cidades);
        
        System.out.print("\nDigite o nome da cidade que deseja substituir: ");
        String cidadeParaSubstituir = scanner.nextLine();
        
       
        if (cidades.contains(cidadeParaSubstituir)) {
          
            System.out.print("Digite o nome da nova cidade: ");
            String novaCidade = scanner.nextLine();
            
          
            int indice = cidades.indexOf(cidadeParaSubstituir);
            
         
            cidades.set(indice, novaCidade);
            
           
            System.out.println("\nLista de cidades atualizada:");
            System.out.println(cidades);
        } else {
            System.out.println("\nCidade não encontrada na lista.");
        }
        
      
        scanner.close();
    }
}