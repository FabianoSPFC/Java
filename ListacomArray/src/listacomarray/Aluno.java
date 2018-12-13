
package listacomarray;

public class Aluno implements Comparable{
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }

    @Override
    public int compareTo(Object o) {
        Aluno a=(Aluno)o;
        return this.nome.compareTo(a.nome);
    }
    
}
