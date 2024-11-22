public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Matrícula: " + matricula);
    }
}
