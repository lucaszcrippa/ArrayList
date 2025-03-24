
package exercicio11.pkg1;

import java.util.ArrayList;

public class Exercicio111 {


    public static void main(String[] args) {
     ArrayList<Double> numerosDecimais = new ArrayList<>();
        numerosDecimais.add(10.5);
        numerosDecimais.add(20.75);
        numerosDecimais.add(30.2);
        numerosDecimais.add(40.1);
        numerosDecimais.add(50.6);

        double soma = 0.0;

        for (Double numero : numerosDecimais) {
            soma += numero;
        }

        System.out.println("A soma de todos os valores é: " + soma);
    }
}