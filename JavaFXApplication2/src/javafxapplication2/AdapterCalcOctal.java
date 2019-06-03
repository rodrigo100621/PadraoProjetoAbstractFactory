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
public class AdapterCalcOctal  implements CoverterResultado{

   OperacaoOctal opOctal;
   
     AdapterCalcOctal(OperacaoOctal opOctal) {
     
         this.opOctal = opOctal;
    }

    
     @Override
    public int converterResultado(int resultado){
     
         opOctal.octal(resultado);
        
         
         return resultado;
    }
}
    