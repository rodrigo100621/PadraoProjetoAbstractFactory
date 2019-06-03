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
public class OperacaoOctal{
    
     public void  octal(int numero)
    {
           String oct = Integer.toOctalString(numero);
            System.out.println("Octal: " + oct);
    }
}
