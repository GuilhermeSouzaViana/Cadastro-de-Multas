package Cadastro;

import Dados.*;
import ObjetosPrincipais.*;


import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeMultas {

    BancoDeDados bancoDeDados = new BancoDeDados();


    public MultaMoto cadastrarMultaMoto(ArrayList<MotoristaMoto> motoristas, ArrayList<Moto> motos) {

                return cadastrarMultasEmMoto(motoristas, motos);
        }


      public MultaAuto cadastrarMultaAuto(ArrayList<MotoristaAutomovel> motoristaA, ArrayList<Automovel> automoveis) {

        return cadastrarMultasEmAutomovel(motoristaA,automoveis);

      }

    public MultaCaminhao cadastrarMultaCaminhao(ArrayList<MotoristaCaminhao> motoristaC, ArrayList<Caminhao> caminhoes) {

        return cadastrarMultasEmCaminhao(motoristaC,caminhoes);

    }


    public MultaMoto cadastrarMultasEmMoto(ArrayList<MotoristaMoto> motoristas, ArrayList<Moto> motos) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Há algum motorista de moto cadastrado ?\n 1-Sim \n 2-Não");
        String motVeiculo=scanner.next();
        System.out.println("Há alguma moto cadastrada ?\n 1-Sim \n 2-Não");
        String veiculo=scanner.next();

        if (motVeiculo.equals("1") && veiculo.equals("1")) {


            System.out.println("Qual o nome do motorista que levou a multa?");
            String nomeMotorista = scanner.next();
            System.out.println("Qual a placa da moto?");
            String placaMoto = scanner.next();
            System.out.println("Qual o tipo da infração ? \n 1-leve \n 2- média \n 3-grave \n 4-gravíssima");
            String infracaoMoto = "Não informado";
            String multa = scanner.next();
            if (multa.equals("1")) {
                infracaoMoto = "Leve";
            } else if (multa.equals("2")) {
                infracaoMoto = "Média";
            } else if (multa.equals("3")) {
                infracaoMoto = "Grave";
            } else if (multa.equals("4")) {
                infracaoMoto = "Gravíssima";
            } else {
                System.out.println("Tipo não informado");
            }
            System.out.println("Qual o valor da multa?");
            Double valorMulta = scanner.nextDouble();
            MotoristaMoto motorista = bancoDeDados.retornaMotoristas(nomeMotorista, motoristas);
            Moto moto = bancoDeDados.retornaMoto(placaMoto, motos);
            return new MultaMoto(motorista, moto, infracaoMoto, valorMulta);
        }else{
            System.out.println("=======================================");
            System.out.println("Finalize os cadastros e tente novamente");
            System.out.println("=======================================");
        }
        return null;
    }



    public MultaAuto cadastrarMultasEmAutomovel(ArrayList<MotoristaAutomovel> motorista, ArrayList<Automovel> automoveis){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Há algum motorista de automovel cadastrado ?\n 1-Sim \n 2-Não");
        String motVeiculo=scanner.next();
        System.out.println("Há algum automovel cadastrado ?\n 1-Sim \n 2-Não");
        String veiculo=scanner.next();

        if (motVeiculo.equals("1") && veiculo.equals("1")) {

        System.out.println("Qual o nome do motorista que levou a multa?");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a placa do automovel?");
        String placaAutomovel = scanner.next();

        System.out.println("Qual o tipo da infração ? \n 1-leve \n 2- média \n 3-grave \n 4-gravíssima");
        String infracaoAutomovel="Não informado";
        String multa=scanner.next();
        if(multa.equals("1")){
            infracaoAutomovel="Leve";
        }else if(multa.equals("2")){
            infracaoAutomovel="Média";
        }else if(multa.equals("3")){
            infracaoAutomovel="Grave";
        }else if(multa.equals("4")){
            infracaoAutomovel="Gravíssima";
        }else{
            System.out.println("Tipo não informado");
        }

        System.out.println("Qual o valor da multa?");
        Double valorMulta = scanner.nextDouble();


        MotoristaAutomovel motoristaAutomovel=bancoDeDados.retornaMotoristaAuto(nomeMotorista,motorista);
        Automovel automovel = bancoDeDados.retornaAutomovel(placaAutomovel, automoveis);

        return new MultaAuto( motoristaAutomovel, automovel, infracaoAutomovel,valorMulta);
    }else{
            System.out.println("=======================================");
            System.out.println("Finalize os cadastros e tente novamente");
            System.out.println("=======================================");
        }
        return null;
    }

    public MultaCaminhao cadastrarMultasEmCaminhao(ArrayList<MotoristaCaminhao> motoristas, ArrayList<Caminhao> caminhoes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Há algum motorista de caminhão cadastrado ?\n 1-Sim \n 2-Não");
        String motVeiculo = scanner.next();
        System.out.println("Há algum caminhão cadastrado ?\n 1-Sim \n 2-Não");
        String veiculo = scanner.next();

        if (motVeiculo.equals("1") && veiculo.equals("1")) {



            System.out.println("Qual o nome do motorista que levou a multa?");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a placa do caminhao?");
        String placaCaminhao = scanner.next();

        System.out.println("Qual o tipo da infração ? \n 1-leve \n 2- média \n 3-grave \n 4-gravíssima");
        String infracaoCaminhao="Não informado";
        String multa=scanner.next();
        if(multa.equals("1")){
            infracaoCaminhao="Leve";
        }else if(multa.equals("2")){
            infracaoCaminhao="Média";
        }else if(multa.equals("3")){
            infracaoCaminhao="Grave";
        }else if(multa.equals("4")){
            infracaoCaminhao="Gravíssima";
        }else{
            System.out.println("Tipo não informado");
        }

        System.out.println("Qual o valor da multa?");
        Double valorMulta = scanner.nextDouble();


        MotoristaCaminhao motoristaCaminhao=bancoDeDados.retornaMotoristaCaminhao(nomeMotorista,motoristas);
        Caminhao caminhao = bancoDeDados.retornaCaminhao(placaCaminhao, caminhoes);

        return new MultaCaminhao(motoristaCaminhao, caminhao, infracaoCaminhao,valorMulta);
    }else{
        System.out.println("=======================================");
        System.out.println("Finalize os cadastros e tente novamente");
        System.out.println("=======================================");
    }
            return null;
}

}
