package ObjetosPrincipais;

public class Caminhao extends Veiculo {

    private String categoria;
    private String suspensao;

    private String iluminacao;

    public Caminhao(String marca, String modelo, String cor,
                    String placa, String pneu,String categoria, String suspensao, String iluminacao) {
        super(marca, modelo, cor, placa, pneu);
        this.categoria = categoria;
        this.suspensao = suspensao;
        this.iluminacao=iluminacao;
    }

    public String getIluminacao() {
        return iluminacao;
    }

    public void setIluminacao(String iluminacao) {
        this.iluminacao = iluminacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }
}
