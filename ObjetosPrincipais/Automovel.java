package ObjetosPrincipais;


public class Automovel extends Veiculo {


    private String consumo;

    public Automovel(String marca, String modelo, String cor, String placa, String pneu, String consumo) {
        super(marca, modelo, cor, placa, pneu);
        this.consumo = consumo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

}
