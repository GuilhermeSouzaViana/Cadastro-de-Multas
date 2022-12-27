package ObjetosPrincipais;


public class MultaMoto {


    MotoristaMoto motoristaMoto;
    Moto moto;
    Automovel automovel;
    Caminhao caminhao;
    public Double valorMulta;

    public String infracao;
    public MultaMoto(MotoristaMoto motorista, Moto moto, String infracao , Double valorMulta) {
        this.motoristaMoto = motorista;
        this.moto = moto;
        this.valorMulta = valorMulta;
        this.infracao=infracao;
    }



    public MotoristaMoto getMotoristaMoto() {
        return motoristaMoto;
    }

    public void setMotoristaMoto(MotoristaMoto motoristaMoto) {
        this.motoristaMoto = motoristaMoto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Double getMulta() {
        return valorMulta;
    }

    public void setMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
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
}
