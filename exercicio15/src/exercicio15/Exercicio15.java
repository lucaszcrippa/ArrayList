
package exercicio15;

import java.util.ArrayList;


public class Exercicio15 {

   
    public static void main(String[] args) {
        // Criação do ArrayList de alunos
        ArrayList<Aluno> alunos = new ArrayList<>();

        // Adicionando alunos ao ArrayList
        alunos.add(new Aluno("Porto", 8.5));
        alunos.add(new Aluno("Lucas Crippa", 9.0));
        alunos.add(new Aluno("Gustagol", 7.5));
        alunos.add(new Aluno("Benedetto", 6.0));

        // Exibindo a lista de alunos
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirAluno();
        }

        // Calculando a média das notas
        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }
        double media = somaNotas / alunos.size();

        // Exibindo a média das notas
        System.out.println("\nMédia das notas: " + media);
    }
}
