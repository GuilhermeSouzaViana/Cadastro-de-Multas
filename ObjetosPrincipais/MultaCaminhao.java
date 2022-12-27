package ObjetosPrincipais;

public class MultaCaminhao {

    MotoristaCaminhao motoristaCaminhao;

    Caminhao caminhao;

    public Double valorMulta;

    public String infracao;


    public MotoristaCaminhao getMotoristaCaminhao() {
        return motoristaCaminhao;
    }

    public void setMotoristaCaminhao(MotoristaCaminhao motoristaCaminhao) {
        this.motoristaCaminhao = motoristaCaminhao;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getInfracao() {
        return infracao;
    }

    public void setInfracao(String infracao) {
        this.infracao = infracao;
    }



    public MultaCaminhao(MotoristaCaminhao motoristaCaminhao, Caminhao caminhao, String infracao,Double valorMulta) {
        this.motoristaCaminhao = motoristaCaminhao;
        this.caminhao = caminhao;
        this.valorMulta = valorMulta;
        this.infracao=infracao;
    }



}





