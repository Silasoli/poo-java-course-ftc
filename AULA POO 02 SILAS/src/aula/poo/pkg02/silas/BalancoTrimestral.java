/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.poo.pkg02.silas;

/**
 *
 * @author Usuario
 */
public class BalancoTrimestral {

    public static void main(String[] args) {
        int gastosJaneiro = 10000;
        int gastosFevereiro  = 18000;
        int gastosMarco  = 12000;
        int gastosTrimestre  = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre/3;
        
        System.out.println("Gasto do trimestre: "+gastosTrimestre);
        System.out.println("Valor da média mensal: "+ mediaMensal);

    }

}
