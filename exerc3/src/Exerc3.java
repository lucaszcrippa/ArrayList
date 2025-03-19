    import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author aluno.saolucas
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criação de um ArrayList de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Criação de um objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Adicionando 10 valores aleatórios entre 1 e 100 no ArrayList
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
            numeros.add(numeroAleatorio);
        }
        
        // Exibindo os números antes de ordenar
        System.out.println("Lista antes de ordenar:");
        System.out.println(numeros);
        
        // Ordenando o ArrayList em ordem crescente
        Collections.sort(numeros);
        
        // Exibindo os números após a ordenação
        System.out.println("\nLista ordenada em ordem crescente:");
        System.out.println(numeros);
    }
}
