package com.mycompany.heranca3;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int escolha;

        ContaBancaria c1;

        int nConta;
        String nomeDono;
        Double saldoC = 0.00;

        System.out.println("Informe o Numero da Conta: ");
        nConta = entrada.nextInt();

        System.out.println("Informe o nome do Dono: ");
        nomeDono = entrada.next();

        c1 = new ContaBancaria(nConta, nomeDono, saldoC);

        c1.setNumeroDaConta(nConta);
        c1.setDono(nomeDono);

        do {

            System.out.println("===========================================================");
            System.out.println("1- Depositar | 2- Sacar | 3- Consultar | 0- Sair do Sistema");
            System.out.println("===========================================================");
            escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Informe o valor do deposito: ");
                    saldoC = entrada.nextDouble();
                    c1.depositar(saldoC);
                    System.out.println("Valor Depositado!");
                    break;
                case 2:
                    boolean validacaoSaldo;

                    System.out.println("Informe o valor a ser sacado: ");
                    saldoC = entrada.nextDouble();

                    validacaoSaldo = c1.sacar(saldoC);

                    if (validacaoSaldo == true) {
                        System.out.println("Valor Sacado com sucesso!");
                    } else {
                        System.out.println("Valor insuficiente no saldo!");
                    }
                    break;

                case 3:
                    System.out.printf("Conta: " + c1.getNumeroDaConta()
                            + "\n Dono: " + c1.getDono()
                            + "\n Saldo: %.1f \n", c1.consultaSaldo());
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Operação Inválida!");

            }

        } while (escolha != 0);

        System.out.println("Você saiu do Sistema!");

    }

}
