/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author matricula
 */
public class Conta {

    public int numero;
    public String titular;
    public double saldo;

    public boolean saca(double value) {
        if (value > this.saldo) {
            return false;
        }
        double novoSaldo = this.saldo - value;
        this.saldo = novoSaldo;
        return true;
    }

    public void deposita(double value) {
        double novoSaldo = this.saldo + value;
        this.saldo = novoSaldo;
    }

    public boolean transfere(Conta destino, double value) {
        if (this.saldo < value) {
            return false;
        } else {
            this.saldo = this.saldo - value;
            destino.saldo = destino.saldo + value;
            return true;
        }

    }

    public void validator(boolean response) {
        if (response == false) {
            System.out.println("Operação não realizada");
        } else {
            System.out.println("Operação realizada");
        }
    }

}
