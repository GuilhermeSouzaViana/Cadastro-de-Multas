package Credenciais;

import Cadastro.*;
import Dados.BancoDeDados;
import ObjetosPrincipais.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfis {

    Scanner scanner = new Scanner(System.in);

    BancoDeDados bancoDeDados = new BancoDeDados();
    CadastroDeMotorista cadastroDeMotorista = new CadastroDeMotorista();
    CadastroDeVeiculo cadastroDeVeiculo = new CadastroDeVeiculo();
    CadastroDeMultas cadastroDeMultas = new CadastroDeMultas();


    ArrayList<MotoristaMoto> motoristaMoto = new ArrayList<>();
    ArrayList<MotoristaAutomovel> motoristaAuto = new ArrayList<>();
    ArrayList<MotoristaCaminhao> motoristaCaminhao = new ArrayList<>();
    ArrayList<Moto> motos = new ArrayList<>();
    ArrayList<Automovel> automoveis = new ArrayList<>();
    ArrayList<Caminhao> caminhoes = new ArrayList<>();
    ArrayList<MultaMoto> multaMoto = new ArrayList<>();
    ArrayList<MultaAuto> multaAuto=new ArrayList<>();
    ArrayList<MultaCaminhao> multaCaminhao=new ArrayList<>();

public void perfilMotorista(){

    int escolha = 99;

    do {
        System.out.println("Digite a opção desejada: \n"+
                "1 - Buscar motos multadas \n" +
                "2 - Buscar automoveis multados \n" +
                "3 - Buscar caminhões  multados \n" +
                "4 - Visualizar veículos multados \n" +
                "5 - Visualizar multas totais dos veiculos \n" +
                "6 - Visualizar  multas totais da empresa \n" +

                "0 - Voltar para o menu anterior ");
        escolha = scanner.nextInt();
        switch (escolha) {

            case 1:
                String buscaMs;
                System.out.println("Qual a placa da moto ?");
                buscaMs=scanner.next();
                bancoDeDados.buscarMoto(multaMoto,buscaMs);
                break;
            case 2:
                String buscaAs;
                System.out.println("Qual a placa do automovel ?");
                buscaAs=scanner.next();
                bancoDeDados.buscarAutomovel(multaAuto,buscaAs);
                break;
            case 3:
                String buscaCs;
                System.out.println("Qual a placa do caminhão ?");
                buscaCs=scanner.next();
                bancoDeDados.buscarCaminhao(multaCaminhao,buscaCs);
                break;
            case 4:
                bancoDeDados.visualizacaoMoto(multaMoto);
                bancoDeDados.visualizacaoAutomovel(multaAuto);
                bancoDeDados.visualizacaoCaminhao(multaCaminhao);
                break;
            case 5:
                bancoDeDados.totalMultasMoto(multaMoto);
                bancoDeDados.totalMultasAuto(multaAuto);
                bancoDeDados.totalMultasCaminhao(multaCaminhao);
                break;
            case 6:
                bancoDeDados.totalMultas(multaMoto,multaAuto,multaCaminhao);
                break;
        }
    }while (escolha!=0);

}

public void perfilAgente(){

    String nome;
    String senha;

    System.out.println("Informe o nome:");
    nome=scanner.next().toLowerCase();
    System.out.println("Informe a senha:");
    senha=scanner.next();


    if(nome.equals("uriel") || nome.equals("joao") && senha.equals("123")) {

        int escolha = 99;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("Digite a opção: ");
            System.out.println("1 - Cadastrar motorista de Moto \n" +
                    "2 - Cadastrar motorista de automovel \n" +
                    "3 - Cadastrar motorista de caminhão \n" +
                    "4 - Cadastrar moto \n" +
                    "5 - Cadastrar automóvel \n" +
                    "6 - Cadastrar caminhão \n" +
                    "7 - Cadastrar multa moto \n" +
                    "8 - Cadastrar multa automovel \n" +
                    "9 - Cadastrar multa caminhão \n" +
                    "10 - Remover multa moto \n" +
                    "11 - Remover multa automovel \n" +
                    "12 - Remover multa caminhão \n" +
                    "\n" +
                    "0 - Voltar para o menu anterior ");
            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    motoristaMoto.add(cadastroDeMotorista.cadastrarMotorista());
                    break;
                case 2:
                    motoristaAuto.add(cadastroDeMotorista.cadastrarMotoristaAuto());
                    break;
                case 3:
                    motoristaCaminhao.add(cadastroDeMotorista.cadastrarMotoristaCaminhao());
                    break;
                case 4:
                    motos.add(cadastroDeVeiculo.cadastrarMoto());
                    break;
                case 5:
                    automoveis.add(cadastroDeVeiculo.cadastrarAutomovel());
                    break;
                case 6:
                    caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
                    break;
                case 7:
                    multaMoto.add(cadastroDeMultas.cadastrarMultaMoto(motoristaMoto, motos));
                    break;
                case 8:
                    multaAuto.add(cadastroDeMultas.cadastrarMultaAuto(motoristaAuto,automoveis));
                    break;
                case 9:
                    multaCaminhao.add(cadastroDeMultas.cadastrarMultaCaminhao(motoristaCaminhao,caminhoes));
                    break;
                case 10:
                    String placaMs;
                    System.out.println("Qual a placa da moto ?");
                    placaMs=scanner.next();
                    bancoDeDados.removerMultaMoto(multaMoto,placaMs);
                    break;
                case 11:
                    String placaAs;
                    System.out.println("Qual a placa do automovel ?");
                    placaAs=scanner.next();
                    bancoDeDados.removerMultaAuto(multaAuto,placaAs);
                    break;
                case 12:
                    String placaCs;
                    System.out.println("Qual a placa do Caminhão ?");
                    placaCs=scanner.next();
                    bancoDeDados.removerMultaCaminhao(multaCaminhao,placaCs);
                    break;
            }

        } while (escolha != 0);
    }else{
        System.out.println("Nome ou senha incorretos");
    }

}

public void perfilGerente(){

    String nome;
    String senha;

    System.out.println("Informe o nome:");
    nome=scanner.next().toLowerCase();
    System.out.println("Informe a senha:");
    senha=scanner.next();


    if(nome.equals("guilherme") && senha.equals("12345")) {

        int escolha = 99;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("Digite a opção: ");
            System.out.println(  "1 - Buscar motos multadas \n" +
                    "2 - Buscar automoveis multados \n" +
                    "3 - Buscar caminhões  multados \n" +
                    "4 - Cadastrar motorista de Moto \n" +
                    "5 - Cadastrar motorista de automovel \n" +
                    "6 - Cadastrar motorista de caminhão \n" +
                    "7 - Cadastrar moto \n" +
                    "8 - Cadastrar automóvel \n" +
                    "9 - Cadastrar caminhão \n" +
                    "10 - Cadastrar multa moto \n" +
                    "11 - Cadastrar multa automovel \n" +
                    "12 - Cadastrar multa caminhão \n" +
                    "13 - Remover multa moto \n" +
                    "14 - Remover multa automovel \n" +
                    "15 - Remover multa caminhão \n" +
                    "16 - Visualizar multas de motos \n" +
                    "17 - Visualizar multas em automóveis \n" +
                    "18 - Visualizar multas em caminhões \n" +
                    "19 - Total multas de motos \n"+
                    "20 - Total multas de automoveis \n"+
                    "21 - Total multas de caminhões \n"+
                    "22 - Total multas da empresa \n"+
                    "\n" +
                    "0 - Voltar para o menu anterior");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    String buscaMs;
                    System.out.println("Qual a placa da moto ?");
                    buscaMs=scanner.next();
                    bancoDeDados.buscarMoto(multaMoto,buscaMs);
                    break;
                case 2:
                    String buscaAs;
                    System.out.println("Qual a placa do automovel ?");
                    buscaAs=scanner.next();
                    bancoDeDados.buscarAutomovel(multaAuto,buscaAs);
                    break;
                case 3:
                    String buscaCs;
                    System.out.println("Qual a placa do caminhão ?");
                    buscaCs=scanner.next();
                    bancoDeDados.buscarCaminhao(multaCaminhao,buscaCs);
                    break;
                case 4:
                    motoristaMoto.add(cadastroDeMotorista.cadastrarMotorista());
                    break;
                case 5:
                    motoristaAuto.add(cadastroDeMotorista.cadastrarMotoristaAuto());
                    break;
                case 6:
                    motoristaCaminhao.add(cadastroDeMotorista.cadastrarMotoristaCaminhao());
                    break;
                case 7:
                    motos.add(cadastroDeVeiculo.cadastrarMoto());
                    break;
                case 8:
                    automoveis.add(cadastroDeVeiculo.cadastrarAutomovel());
                    break;
                case 9:
                    caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
                    break;
                case 10:
                    multaMoto.add(cadastroDeMultas.cadastrarMultaMoto(motoristaMoto, motos));
                    break;
                case 11:
                    multaAuto.add(cadastroDeMultas.cadastrarMultaAuto(motoristaAuto,automoveis));
                    break;

                case 12:
                    multaCaminhao.add(cadastroDeMultas.cadastrarMultaCaminhao(motoristaCaminhao,caminhoes));
                    break;
                case 13:
                    String placaMs;
                    System.out.println("Qual a placa da moto ?");
                    placaMs=scanner.next();
                    bancoDeDados.removerMultaMoto(multaMoto,placaMs);
                    break;
                case 14:
                    String placaAs;
                    System.out.println("Qual a placa do automovel ?");
                    placaAs=scanner.next();
                    bancoDeDados.removerMultaAuto(multaAuto,placaAs);
                    break;
                case 15:
                    String placaCs;
                    System.out.println("Qual a placa do Caminhão ?");
                    placaCs=scanner.next();
                    bancoDeDados.removerMultaCaminhao(multaCaminhao,placaCs);
                    break;
                case 16:
                    bancoDeDados.visualizacaoMoto(multaMoto);
                    break;
                case 17:
                    bancoDeDados.visualizacaoAutomovel(multaAuto);
                    break;
                case 18:
                    bancoDeDados.visualizacaoCaminhao(multaCaminhao);
                    break;
                case 19:
                    bancoDeDados.totalMultasMoto(multaMoto);
                    break;
                case 20:
                    bancoDeDados.totalMultasAuto(multaAuto);
                    break;
                case 21:
                    bancoDeDados.totalMultasCaminhao(multaCaminhao);
                    break;
                case 22:
                    bancoDeDados.totalMultas(multaMoto,multaAuto,multaCaminhao);
                    break;
            }

        } while (escolha != 0);
    }else{
        System.out.println("Nome ou senha incorretos");
    }
}



















}
