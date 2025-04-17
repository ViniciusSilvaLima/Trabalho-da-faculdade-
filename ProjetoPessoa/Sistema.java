import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Sistema {
    static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Cadastrar", "Listar", "Editar", "Salvar em Arquivo", "Ler Arquivo", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 0) cadastrarPessoa();
            else if (escolha == 1) listarPessoas();
            else if (escolha == 2) editarPessoa();
            else if (escolha == 3) salvarArquivo();
            else if (escolha == 4) lerArquivo();
            else break;
        }
    }

    static void cadastrarPessoa() {
        Pessoa p = new Pessoa();
        p.setNome(JOptionPane.showInputDialog("Nome:"));
        p.setCpf(JOptionPane.showInputDialog("CPF:"));
        p.setRg(JOptionPane.showInputDialog("RG:"));
        p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
        p.setTelefone(JOptionPane.showInputDialog("Telefone:"));
        p.setEndereco(JOptionPane.showInputDialog("Endereço:"));

        listaPessoas.add(p);
        JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
    }

    static void listarPessoas() {
        if (listaPessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada.");
            return;
        }

        StringBuilder sb = new StringBuilder("PESSOAS CADASTRADAS:\n\n");
        for (int i = 0; i < listaPessoas.size(); i++) {
            sb.append("[").append(i).append("] ").append(listaPessoas.get(i).mostrarDados()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void editarPessoa() {
        if (listaPessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa para editar.");
            return;
        }

        String[] nomes = listaPessoas.stream().map(Pessoa::toString).toArray(String[]::new);
        int indice = JOptionPane.showOptionDialog(null, "Escolha a pessoa para editar:", "Editar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, nomes, nomes[0]);

        if (indice >= 0 && indice < listaPessoas.size()) {
            Pessoa p = listaPessoas.get(indice);
            p.setNome(JOptionPane.showInputDialog("Novo nome:", p.getNome()));
            p.setCpf(JOptionPane.showInputDialog("Novo CPF:", p.getCpf()));
            p.setRg(JOptionPane.showInputDialog("Novo RG:", p.getRg()));
            p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Nova idade:", p.getIdade())));
            p.setTelefone(JOptionPane.showInputDialog("Novo telefone:", p.getTelefone()));
            p.setEndereco(JOptionPane.showInputDialog("Novo endereço:", p.getEndereco()));
            JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
        }
    }

    static void salvarArquivo() {
        try (FileWriter writer = new FileWriter("cadastros.txt")) {
            for (Pessoa p : listaPessoas) {
                writer.write(p.mostrarDados() + "\n");
            }
            JOptionPane.showMessageDialog(null, "Arquivo salvo como 'cadastros.txt'");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    static void lerArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("cadastros.txt"))) {
            StringBuilder sb = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                sb.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(null, "Conteúdo do arquivo:\n\n" + sb.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + e.getMessage());
        }
    }
}