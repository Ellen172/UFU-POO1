public class Cliente {
    private String nome, CPF, telefone;
    private int idade;
    private String user, senha;

    public void cadastraCliente(String n, String cpf, String t, int i, String u, String s) {
        setNome(n);
        setCPF(cpf);
        setTelefone(t);
        setIdade(i);
        setUser(u);
        setSenha(s);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        this.CPF = cPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}