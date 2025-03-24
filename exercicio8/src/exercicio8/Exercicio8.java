
package exercicio8;

import java.util.ArrayList;
import java.util.Collections;


public class Exercicio8 {

    
    public static void main(String[] args) {
           ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");

       
        System.out.println("Ordem original: " + lista);

        
        Collections.reverse(lista);

       
        System.out.println("Ordem inversa: " + lista);
    }
}