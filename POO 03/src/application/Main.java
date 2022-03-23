/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.Conta;

/**
 *
 * @author matricula
 */
public class Main {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        boolean response;
        boolean responseTransf;
        
        minhaConta.numero = 007;
        minhaConta.titular = "0 amigos, 0 namoradas, 7 derrotas no ferro";
        minhaConta.saldo = 8000;

        minhaConta.saca(1000);

        System.out.println("Saldo atual: " + minhaConta.saldo);

        minhaConta.deposita(999);

        System.out.println("Saldo atual: " + minhaConta.saldo);

        response = minhaConta.saca(8000);
        minhaConta.validator(response);

        Conta C1 = new Conta();
        Conta C2 = new Conta();

        C1.saldo = 1000;
        C2.saldo = 0;

        responseTransf = C1.transfere(C2, 1500);
        C1.validator(responseTransf);
        
        System.out.println("Saldo atual da C1:  " + C1.saldo);
        System.out.println("Saldo atual da C2:  " + C2.saldo);

    }

}
