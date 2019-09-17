package com.mycompany.heranca3;

public class ContaBancaria {


    private int numeroDaConta;
    private String dono;
    private Double saldo;
   
    
    
    public ContaBancaria (int numeroDaConta, String dono, Double saldo){
        
     this.numeroDaConta = numeroDaConta;
     this.dono = dono;
     this.saldo = saldo;

    
    }

    public boolean sacar(Double quantS) {
        if ((quantS > 0) && (quantS <= this.saldo)) {
            this.saldo =  this.saldo - quantS;
            return true;
        } else {
            return false;
        }
    }
    
    public Double depositar(Double quantD){
        if (quantD > 0){
            this.saldo = quantD + this.saldo;
        }
        return this.saldo;
    }
    
    
    public Double consultaSaldo(){
    return this.saldo;
    }
    
     public int getNumeroDaConta() {
        return numeroDaConta;
    }
   
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getDono() {
        return dono;
    }

  
    public void setDono(String dono) {
        this.dono = dono;
    }

    
}
