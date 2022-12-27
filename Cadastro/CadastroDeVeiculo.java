package Cadastro;

import ObjetosPrincipais.*;

import java.util.Scanner;



public class CadastroDeVeiculo {
        Scanner scanner = new Scanner(System.in);

        public Moto cadastrarMoto() {


                System.out.println("Digite o a marca da moto: ");
                String motoMarca = scanner.next();

                System.out.println("Digite o modelo: ");
                String motoModelo = scanner.next();

                System.out.println("Qual é a cor : ");
                String motoCor = scanner.next();

                System.out.println("Digite o número da placa: ");
                String motoPlaca = scanner.next();


                System.out.println("Qual o estado atual dos pneus ?: ");
                String motoPneu = scanner.next();


                System.out.println("Quantas cilindradas : ");

                String motoCilindrada = scanner.next();

                System.out.println("===============");
                System.out.println("Moto cadastrada");
                System.out.println("===============");

                return new Moto(motoMarca, motoModelo, motoCor, motoPlaca, motoPneu, motoCilindrada);
        }


        public Automovel cadastrarAutomovel() {


                System.out.println("Digite o a marca do automovel: ");
                String autoMarca = scanner.next();

                System.out.println("Digite o modelo: ");
                String autoModelo = scanner.next();

                System.out.println("Qual é a cor : ");
                String autoCor = scanner.next();

                System.out.println("Digite o número da placa: ");
                String autoPlaca = scanner.next();
                ;

                System.out.println("Qual o estado atual dos pneus ?: ");
                String autoPneu = scanner.next();

                System.out.println("Qual o consumo km/l ? ");
                String autoConsumo = scanner.next();


                System.out.println("====================");
                System.out.println("Automovel cadastrado");
                System.out.println("====================");

                return new Automovel(autoMarca, autoModelo, autoCor, autoPlaca, autoPneu, autoConsumo);
        }

        public Caminhao cadastrarCaminhao() {

                System.out.println("Digite a marca do caminhão : ");
                String caminhaoMarca = scanner.next();

                System.out.println("Digite o modelo: ");
                String caminhaoModelo = scanner.next();

                System.out.println("Qual a cor ?: ");
                String caminhaoCor = scanner.next();

                System.out.println("Digite o número da placa: ");
                String caminhaoPlaca = scanner.next();

                System.out.println("Digite a categoria: ");
                String caminhaoCategoria = scanner.next();

                System.out.println("Qual o estado atual dos pneus ?: ");
                String caminhaoPneu = scanner.next();

                System.out.println("Qual é o estado atual da suspensão: ");
                String caminhaoSuspensao = scanner.next();

                System.out.println("Qual o estado atual do sistema de iluminação ? ");
                String caminhaoIluminacao = scanner.next();

                System.out.println("===================");
                System.out.println("Caminhão cadastrado");
                System.out.println("===================");

                return new Caminhao(caminhaoMarca, caminhaoModelo, caminhaoCor, caminhaoPlaca,
                        caminhaoPneu, caminhaoCategoria, caminhaoSuspensao, caminhaoIluminacao);

        }

}