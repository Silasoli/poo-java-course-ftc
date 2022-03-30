/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.Conta;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {

        Conta contaComTitular = new Conta("Com titular");
        Conta contaSemTitular = new Conta("testew");

        System.out.println("Titular " + contaComTitular.titular);
        contaComTitular.setSaldo(1000);
        System.out.println("Saldo " + contaComTitular.getSaldo());
        System.out.println("identificador " + contaComTitular.getIdentificador());

        System.out.println("Titular " + contaSemTitular.titular);
        contaSemTitular.setSaldo(2000);
        System.out.println("Saldo " + contaSemTitular.getSaldo());
        System.out.println("identificador " + contaSemTitular.getIdentificador());

        System.out.println("Total de contas: " + Conta.gettotalDeContas());

    }

}
