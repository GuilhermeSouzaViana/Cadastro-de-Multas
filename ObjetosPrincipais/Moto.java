package ObjetosPrincipais;


public class Moto extends Veiculo {

    private String cilindradas;


    public Moto(String marca, String modelo, String cor,
                String placa, String pneu,String cilindradas) {
        super(marca, modelo, cor, placa, pneu);
        this.cilindradas = cilindradas;
    }


    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

}
