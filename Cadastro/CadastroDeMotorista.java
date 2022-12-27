package Cadastro;

import ObjetosPrincipais.*;

import java.util.Scanner;

public class CadastroDeMotorista {


    public MotoristaMoto cadastrarMotorista() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do motorista da moto : ");
            String nomeMotorista = scanner.next();

            System.out.println("Qual a idade : ");
            String idadeMotorista = scanner.next();

            System.out.println("Digite a CNH do motorista: ");
            String cnhMotorista = scanner.next();

        System.out.println("============================");
        System.out.println("Motorista de moto cadastrado");
        System.out.println("============================");

            return new MotoristaMoto(nomeMotorista, idadeMotorista, cnhMotorista);
        }

    public MotoristaAutomovel cadastrarMotoristaAuto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do motorista do automovel : ");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a idade : ");
        String idadeMotorista = scanner.next();

        System.out.println("Digite a CNH do motorista: ");
        String cnhMotorista = scanner.next();

        System.out.println("=================================");
        System.out.println("Motorista de automovel cadastrado");
        System.out.println("=================================");

        return new MotoristaAutomovel(nomeMotorista, idadeMotorista, cnhMotorista);

    }

    public MotoristaCaminhao cadastrarMotoristaCaminhao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do motorista do caminhão: ");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a idade : ");
        String idadeMotorista = scanner.next();

        System.out.println("Digite a CNH do motorista: ");
        String cnhMotorista = scanner.next();


        System.out.println("================================");
        System.out.println("Motorista de caminhão cadastrado");
        System.out.println("================================");

        return new MotoristaCaminhao(nomeMotorista, idadeMotorista, cnhMotorista);
    }


}
