
package exercicio15;


public class Aluno {
   private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // Método para exibir informações do aluno
    public void exibirAluno() {
        System.out.println("Nome: " + nome + ", Nota: " + nota);
    }
}

