
package exercicio7;

import java.util.ArrayList;
import java.util.HashSet;


public class Exercicio7 {

   
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(1);
        lista.add(5);
     
        HashSet<Integer> set = new HashSet<>(lista);

        ArrayList<Integer> listaSemRepeticao = new ArrayList<>(set);

        System.out.println("Lista sem repetições: " + listaSemRepeticao);
    }
}