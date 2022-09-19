/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author Cliente
 */
public class Motor {    
    private int potencia;
    
    public Motor(){
        potencia=1000;//VALOR PADRAO
    }

    public Motor(int potenia){
        this.potencia=potencia; //valor definido por voces
    }
            
            
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
