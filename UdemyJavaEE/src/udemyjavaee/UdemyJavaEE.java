/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyjavaee;

/**
 *
 * @author krixz
 */
public class UdemyJavaEE {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro c1 = new Carro("honda","BX105","verde","ER4378",12758);
        Carro c2 = new Carro("honda","BX105","verde","ER4378",12758);
        
        System.out.println("El modelo es:" +c1.getModelo());
        System.out.println("La marca es:  = " + c1.getMarca() );
        System.out.println("El color es: = " + c1.getColor());
        System.out.println("La petente es: " + c1.getMatricula());
        System.out.println("El percio es: " + c1.getPrecio());
        
        System.out.println("El modelo es:" +c2.getModelo());
        System.out.println("La marca es:  = " + c2.getMarca() );
        System.out.println("El color es: = " + c2.getColor());
        System.out.println("La petente es: " + c2.getMatricula());
        System.out.println("El percio es: " + c2.getPrecio());
        
        if(c1.equals(c2)) {
            System.out.println("los objetos son iguales");
        }
        else {
            System.out.println("los objetos son distintos");
        }
        

        
    }
    
}
