/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.poo.pkg02.pkg1.silas;

/**
 *
 * @author Usuario
 */
public class AULAPOO021SILAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                contador = contador + i;
            }
        }
        System.out.println(contador);

    }

}
