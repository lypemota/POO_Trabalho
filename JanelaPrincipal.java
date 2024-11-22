import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal() {
        setTitle("Gerenciamento Estudantil");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menu Principal
        JPanel painel = new JPanel();
        JButton btnAluno = new JButton("Gerenciar Alunos");
        JButton btnProfessor = new JButton("Gerenciar Professores");
        JButton btnCurso = new JButton("Gerenciar Cursos");
        JButton btnSair = new JButton("Sair");

        painel.add(btnAluno);
        painel.add(btnProfessor);
        painel.add(btnCurso);
        painel.add(btnSair);

        add(painel);

        // Ações dos Botões
        btnAluno.addActionListener(
                e -> JOptionPane.showMessageDialog(this, "Tela de Gerenciamento de Alunos ainda não implementada."));
        btnProfessor.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Tela de Gerenciamento de Professores ainda não implementada."));
        btnCurso.addActionListener(
                e -> JOptionPane.showMessageDialog(this, "Tela de Gerenciamento de Cursos ainda não implementada."));
        btnSair.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal().setVisible(true));
    }
}
