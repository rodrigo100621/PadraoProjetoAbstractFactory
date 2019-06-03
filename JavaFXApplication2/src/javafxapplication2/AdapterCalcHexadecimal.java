/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

/**
 *
 * @author rodri
 */
public class AdapterCalcHexadecimal  implements CoverterResultado{

   OperacaoHexadecimal opHexadecimal;
   
     AdapterCalcHexadecimal(OperacaoHexadecimal opHexadecimal) {
     
         this.opHexadecimal = opHexadecimal;
    }

    
     @Override
    public int converterResultado(int resultado){
     
         opHexadecimal.hexadecimal(resultado);
        
         
         return resultado;
    }
    
    
}
