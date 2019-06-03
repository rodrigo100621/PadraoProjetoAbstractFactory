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
public class OperacaoHexadecimal{
     public void  hexadecimal(int numero)
    {
      	
       String hex = Integer.toHexString(numero);
       System.out.println("Hexa decimal: " + hex);
    }
}
