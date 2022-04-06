/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class ContaCorrente extends Conta{
    
    public double limite;
    
    
    public void addLimite(double value) {
        this.limite += value;
    }
    
     public void removeLimite(double value) {
        this.limite -= value;
    }
    
}
