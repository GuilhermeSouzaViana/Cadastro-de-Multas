package ObjetosPrincipais;

public class MultaAuto {



    MotoristaAutomovel motoristaAutomovel;
    Automovel automovel;

    public Double valorMulta;

    public String infracao;

    public MotoristaAutomovel getMotoristaAutomovel() {
        return motoristaAutomovel;
    }

    public void setMotoristaAutomovel(MotoristaAutomovel motoristaAutomovel) {
        this.motoristaAutomovel = motoristaAutomovel;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
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




    public MultaAuto(MotoristaAutomovel motoristaAutomovel, Automovel automovel, String infracao,Double valorMulta) {
        this.motoristaAutomovel = motoristaAutomovel;
        this.automovel = automovel;
        this.valorMulta = valorMulta;
        this.infracao=infracao;
    }

}
