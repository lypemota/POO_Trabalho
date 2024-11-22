import java.util.List;

public class Relatorios {
    public static void gerarRelatorioEstudantes(List<Estudante> estudantes) {
        System.out.println("Relatório de Estudantes:");
        for (Estudante estudante : estudantes) {
            estudante.exibirDados();
        }
    }

    public static void gerarRelatorioProfessores(List<Professor> professores) {
        System.out.println("Relatório de Professores:");
        for (Professor professor : professores) {
            professor.exibirDados();
        }
    }
}
