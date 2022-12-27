package ObjetosPrincipais;

public class Veiculo  {

    public Veiculo(String marca, String modelo, String cor, String placa, String pneu) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.pneu=pneu;
    }

    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    public String getPneu() {
        return pneu;
    }

    public void setPneu(String pneu) {
        this.pneu = pneu;
    }

    private String pneu;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
