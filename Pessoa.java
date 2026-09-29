public class Pessoa {
    private String nome;
    private int idade;
    private int telefone;

    public Pessoa(){}
    
    public Pessoa(String n, String e, int i){
        this.nome = n;
        this.idade = i;
    }


    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}