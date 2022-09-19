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
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // primeira forma de chamar os construtores
     /*   
        Carro carro = new Carro();
        Carro carro2 = new Carro(2000);
   
*/
     // segunda forma de chamar os metodos
     /*
    Carro carro3 = new Carro();
    carro3.ligarCarro(2000);
    */
     
     Carro carro4 = new Carro(0);
     Motor motor = new Motor();
     Motor motor2 = new Motor(2000);
     
     carro4.setMotor(motor);
     
     carro4.ImprimeDados();
     
     
     
     
     
    }
    
     
     
    
    
}
