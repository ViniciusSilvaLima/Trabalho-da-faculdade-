public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private String telefone;
    private String endereco;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String mostrarDados() {
        return "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "RG: " + rg + "\n" +
               "Idade: " + idade + "\n" +
               "Telefone: " + telefone + "\n" +
               "Endereço: " + endereco + "\n";
    }

    @Override
    public String toString() {
        return nome + " - " + cpf;
    }
}