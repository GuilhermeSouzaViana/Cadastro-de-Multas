package ObjetosPrincipais;

public class MotoristaMoto {

    private String nome;
    private String cnh;

    private String idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public MotoristaMoto(String nome, String idade , String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.idade=idade;
    }
}
