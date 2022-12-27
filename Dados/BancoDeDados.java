package Dados;
;
import ObjetosPrincipais.*;
import java.util.ArrayList;

public class BancoDeDados {

    public MotoristaAutomovel retornaMotoristaAuto(String nomeMotorista, ArrayList<MotoristaAutomovel> motoristas) {

        for (int i = 0; i <= motoristas.size(); i++) {
            if (nomeMotorista.equals(motoristas.get(i).getNome())) {
                System.out.println("=====================================================");
                System.out.println("Multa vinculada ao motorista do automovel com sucesso");
                System.out.println("======================================================");
                return motoristas.get(i);

            }
        }
        System.out.println("Motorista não encontrado");
        return null;
    }

    public MotoristaCaminhao retornaMotoristaCaminhao(String nomeMotorista, ArrayList<MotoristaCaminhao> motoristas) {

        for (int i = 0; i <= motoristas.size(); i++) {
            if (nomeMotorista.equals(motoristas.get(i).getNome())) {
                System.out.println("====================================================");
                System.out.println("Multa vinculada ao motorista do caminhão com sucesso");
                System.out.println("====================================================");
                return motoristas.get(i);

            }
        }

        return null;
    }


    public MotoristaMoto retornaMotoristas(String nomeMotorista, ArrayList<MotoristaMoto> motoristas) {

        for (int i = 0; i <= motoristas.size(); i++) {
            if (nomeMotorista.equals(motoristas.get(i).getNome())) {
                System.out.println("================================================");
                System.out.println("Multa vinculada ao motorista da moto com sucesso");
                System.out.println("================================================");
                return motoristas.get(i);

              }
            }

        return null;
    }


    public Moto retornaMoto(String placaMoto, ArrayList<Moto> motos) {

            for (int i = 0; i <= motos.size(); i++) {
                if (placaMoto.equals(motos.get(i).getPlaca())) {
                    System.out.println("==================================");
                    System.out.println("Multa vinculada a moto com sucesso");
                    System.out.println("==================================");
                    return motos.get(i);
                }
            }

        return null;
    }

    public Automovel retornaAutomovel(String placaAutomovel, ArrayList<Automovel> automoveis) {

        for (int i = 0; i <= automoveis.size(); i++) {
            if (placaAutomovel.equals(automoveis.get(i).getPlaca())) {
                System.out.println("========================================");
                System.out.println("Multa vinculada ao automovel com sucesso");
                System.out.println("========================================");
                return automoveis.get(i);
            }
        }


        return null;
    }

    public Caminhao retornaCaminhao(String placaCaminhao, ArrayList<Caminhao> caminhoes) {

        for (int i = 0; i <= caminhoes.size(); i++) {
            if (placaCaminhao.equals(caminhoes.get(i).getPlaca())) {
                System.out.println("=======================================");
                System.out.println("Multa vinculada ao caminhão com sucesso");
                System.out.println("========================================");
                return caminhoes.get(i);
            }
        }


        return null;
    }


    public void removerMultaMoto(ArrayList<MultaMoto>multas,String placa){

        for (int i = 0; i<multas.size(); i++){
            System.out.println("======================================================");
            if (placa.equals(multas.get(i).getMoto().getPlaca())){
                multas.remove(i);
                System.out.println("O multa da moto com a placa: " + placa +" Foi removida!");
            }

        }
        System.out.println("======================================================");

    }


    public void removerMultaAuto(ArrayList<MultaAuto>multas,String placa){

        for (int i = 0; i<multas.size(); i++){
            System.out.println("======================================================");
            if (placa.equals(multas.get(i).getAutomovel().getPlaca())){
                multas.remove(i);
                System.out.println("O multa do automovel com a placa: " + placa +" Foi removida!");
            }

        }
        System.out.println("======================================================");

    }


    public void removerMultaCaminhao(ArrayList<MultaCaminhao>multas,String placa){

        for (int i = 0; i<multas.size(); i++){
            System.out.println("======================================================");
            if (placa.equals(multas.get(i).getCaminhao().getPlaca())){
                multas.remove(i);
                System.out.println("A multa do caminhão com a placa: " + placa +" Foi removida!");
            }

        }
            System.out.println("======================================================");

    }

    public void visualizacaoMoto(ArrayList<MultaMoto>multas) {

            for (int i = 0; i < multas.size(); i++) {
                System.out.println("===========Moto===========");
                System.out.println("Nome do motorista: " + multas.get(i).getMotoristaMoto().getNome());
                System.out.println("idade do motorista: " + multas.get(i).getMotoristaMoto().getIdade());
                System.out.println("Cnh: " + multas.get(i).getMotoristaMoto().getCnh()+"\n");

                System.out.println("Marca: "+multas.get(i).getMoto().getMarca());
                System.out.println("Modelo: "+multas.get(i).getMoto().getModelo());
                System.out.println("Cor: "+multas.get(i).getMoto().getCor());
                System.out.println("Placa: "+multas.get(i).getMoto().getPlaca());
                System.out.println("Estado dos pneus: "+multas.get(i).getMoto().getPneu());
                System.out.println("Cilindradas: "+multas.get(i).getMoto().getCilindradas());
                System.out.println("Tipo de infração: " + multas.get(i).infracao);
                System.out.println("Valor da multa: " + multas.get(i).valorMulta);

            }
            System.out.println("=========================");
    }

    public void buscarMoto(ArrayList<MultaMoto>multas,String placa) {

        for (int i = 0; i<multas.size(); i++){

            if (placa.equals(multas.get(i).getMoto().getPlaca())){
                System.out.println("===========Moto===========");
                System.out.println("Nome do motorista: " + multas.get(i).getMotoristaMoto().getNome());
                System.out.println("idade do motorista: " + multas.get(i).getMotoristaMoto().getIdade());
                System.out.println("Cnh: " + multas.get(i).getMotoristaMoto().getCnh()+"\n");

                System.out.println("Marca: "+multas.get(i).getMoto().getMarca());
                System.out.println("Modelo: "+multas.get(i).getMoto().getModelo());
                System.out.println("Cor: "+multas.get(i).getMoto().getCor());
                System.out.println("Placa: "+multas.get(i).getMoto().getPlaca());
                System.out.println("Estado dos pneus: "+multas.get(i).getMoto().getPneu());
                System.out.println("Cilindradas: "+multas.get(i).getMoto().getCilindradas());
                System.out.println("Tipo de infração: " + multas.get(i).infracao);
                System.out.println("Valor da multa: " + multas.get(i).valorMulta);
            }
        }
        System.out.println("=========================");
    }
    public void visualizacaoAutomovel(ArrayList<MultaAuto>multas) {

            for (int i = 0; i < multas.size(); i++) {
                System.out.println("===========Automovel===========");
                System.out.println("Nome do motorista: " + multas.get(i).getMotoristaAutomovel().getNome());
                System.out.println("idade do motorista: " + multas.get(i).getMotoristaAutomovel().getIdade());
                System.out.println("Cnh: " + multas.get(i).getMotoristaAutomovel().getCnh()+"\n");

                System.out.println("Marca: "+multas.get(i).getAutomovel().getMarca());
                System.out.println("Modelo: "+multas.get(i).getAutomovel().getModelo());
                System.out.println("Cor: "+multas.get(i).getAutomovel().getCor());
                System.out.println("Placa: "+multas.get(i).getAutomovel().getPlaca());
                System.out.println("Estado dos pneus: "+multas.get(i).getAutomovel().getPneu());
                System.out.println("Tipo de infração: " + multas.get(i).infracao);
                System.out.println("Valor da multa: " + multas.get(i).valorMulta);

            }
        System.out.println("=============================");
    }

    public void buscarAutomovel(ArrayList<MultaAuto>multas,String placa) {

        for (int i = 0; i<multas.size(); i++){
            if (placa.equals(multas.get(i).getAutomovel().getPlaca())){
                System.out.println("===========Automovel===========");
                System.out.println("Nome do motorista: " + multas.get(i).getMotoristaAutomovel().getNome());
                System.out.println("idade do motorista: " + multas.get(i).getMotoristaAutomovel().getIdade());
                System.out.println("Cnh: " + multas.get(i).getMotoristaAutomovel().getCnh()+"\n");

                System.out.println("Marca: "+multas.get(i).getAutomovel().getMarca());
                System.out.println("Modelo: "+multas.get(i).getAutomovel().getModelo());
                System.out.println("Cor: "+multas.get(i).getAutomovel().getCor());
                System.out.println("Placa: "+multas.get(i).getAutomovel().getPlaca());
                System.out.println("Estado dos pneus: "+multas.get(i).getAutomovel().getPneu());
                System.out.println("Tipo de infração: " + multas.get(i).infracao);
                System.out.println("Valor da multa: " + multas.get(i).valorMulta);
            }
        }
        System.out.println("=============================");
    }

    public void visualizacaoCaminhao(ArrayList<MultaCaminhao>multas) {

            for (int i = 0; i < multas.size(); i++) {
                System.out.println("==========Caminhão==========");
                System.out.println("Nome do motorista: " + multas.get(i).getMotoristaCaminhao().getNome());
                System.out.println("idade do motorista: " + multas.get(i).getMotoristaCaminhao().getIdade());
                System.out.println("Cnh: " + multas.get(i).getMotoristaCaminhao().getCnh()+"\n");

                System.out.println("Marca: "+multas.get(i).getCaminhao().getMarca());
                System.out.println("Modelo: "+multas.get(i).getCaminhao().getModelo());
                System.out.println("cor: "+multas.get(i).getCaminhao().getCor());
                System.out.println("Placa: "+multas.get(i).getCaminhao().getPlaca());
                System.out.println("Categoria: "+multas.get(i).getCaminhao().getCategoria());
                System.out.println("Estado dos pneus: "+multas.get(i).getCaminhao().getPneu());
                System.out.println("Estado da suspensão: "+multas.get(i).getCaminhao().getSuspensao());
                System.out.println("Estado do sistema de iluminação: "+multas.get(i).getCaminhao().getIluminacao());
                System.out.println("Tipo de infração: " + multas.get(i).infracao);
                System.out.println("Valor da multa: " + multas.get(i).valorMulta);

            }
        System.out.println("==============================");
        }

    public void buscarCaminhao(ArrayList<MultaCaminhao>multas,String placa) {

        for (int i = 0; i<multas.size(); i++){

            if (placa.equals(multas.get(i).getCaminhao().getPlaca())){
                System.out.println("==========Caminhão==========");
                System.out.println("Nome do motorista: " + multas.get(i).getMotoristaCaminhao().getNome());
                System.out.println("idade do motorista: " + multas.get(i).getMotoristaCaminhao().getIdade());
                System.out.println("Cnh: " + multas.get(i).getMotoristaCaminhao().getCnh()+"\n");

                System.out.println("Marca: "+multas.get(i).getCaminhao().getMarca());
                System.out.println("Modelo: "+multas.get(i).getCaminhao().getModelo());
                System.out.println("cor: "+multas.get(i).getCaminhao().getCor());
                System.out.println("Placa: "+multas.get(i).getCaminhao().getPlaca());
                System.out.println("Categoria: "+multas.get(i).getCaminhao().getCategoria());
                System.out.println("Estado dos pneus: "+multas.get(i).getCaminhao().getPneu());
                System.out.println("Estado da suspensão: "+multas.get(i).getCaminhao().getSuspensao());
                System.out.println("Estado do sistema de iluminação: "+multas.get(i).getCaminhao().getIluminacao());
                System.out.println("Tipo de infração: " + multas.get(i).infracao);
                System.out.println("Valor da multa: " + multas.get(i).valorMulta);
            }
        }
        System.out.println("===========================");
    }


    public void totalMultasMoto(ArrayList<MultaMoto>multas) {

        Double tot = 0.0;
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < multas.size(); i++) {

            tot+=multas.get(i).valorMulta;

        }
        System.out.println("o total de multas das motos atualmente esta no valor de: " + tot);
        System.out.println("------------------------------------------------------------------");
    }

    public void totalMultasAuto(ArrayList<MultaAuto>multas) {

        Double tot = 0.0;
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < multas.size(); i++) {

            tot+=multas.get(i).valorMulta;

        }
        System.out.println("o total de multas dos automoveis atualmente esta no valor de: " + tot);
        System.out.println("------------------------------------------------------------------");
    }

    public void totalMultasCaminhao(ArrayList<MultaCaminhao>multas) {

        Double tot = 0.0;
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < multas.size(); i++) {

            tot+=multas.get(i).valorMulta;

        }
        System.out.println("o total de multas dos caminhões atualmente esta no valor de: " + tot);
        System.out.println("------------------------------------------------------------------");
    }


    public void totalMultas(ArrayList<MultaMoto>multaM,ArrayList<MultaAuto>multaA,
                            ArrayList<MultaCaminhao>multaC){
        Double total=0.0;
        System.out.println("--------------------------------------------------");

        Double totM = 0.0;
        for (int i = 0; i < multaM.size(); i++) {

            totM+=multaM.get(i).valorMulta;
        }

        Double totA = 0.0;
        for (int i = 0; i < multaA.size(); i++) {

            totA+=multaA.get(i).valorMulta;
        }

        Double totC = 0.0;

        for (int i = 0; i < multaC.size(); i++) {

            totC+=multaC.get(i).valorMulta;
        }

         total=totM+totA+totC;

        System.out.println("o total de multas da empresa atualmente é: " + total);

        System.out.println("--------------------------------------------------");
    }

}



