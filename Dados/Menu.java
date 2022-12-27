package Dados;

import Credenciais.*;

import java.util.Scanner;

public class Menu {

    Perfis credencial=new Perfis();
    Scanner scanner=new Scanner(System.in);

    public void iniciarSistema() {
        int escolhaPerfil;

        do {
            System.out.println("Olá, seja bem vindo ao sistema de cadastro de multas");
            System.out.println("Qual perfil deseja acessar: \n" +
                    "1 - Motorista \n" +
                    "2 - Agente \n" +
                    "3 - Gerente \n"+
                    "99- Sair do sistema");
            escolhaPerfil = scanner.nextInt();

            if (escolhaPerfil==1){

                credencial.perfilMotorista();

            } else if(escolhaPerfil==2){

                credencial.perfilAgente();

            }else if(escolhaPerfil==3){

                credencial.perfilGerente();

            }

        } while (escolhaPerfil != 99);
    }

}
