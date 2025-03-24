
package exercicio9;

import java.util.ArrayList;


public class Exercicio9 {

  
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carlos");
        nomes.add("Diana");
        nomes.add("Eva");

        ArrayList<String> copiaNomes = new ArrayList<>(nomes);

        System.out.println("ArrayList original: " + nomes);

        System.out.println("ArrayList copiado: " + copiaNomes);
    }
}