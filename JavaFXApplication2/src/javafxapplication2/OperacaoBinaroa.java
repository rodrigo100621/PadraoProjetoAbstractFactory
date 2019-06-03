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
public class OperacaoBinaroa{
    
   public void  binario(int numero)
    {
      	int d = numero;
		StringBuffer binario = new StringBuffer(); // guarda os dados
		while (d > 0) {
			int b = d % 2;
			binario.append(b);
			d = d >> 1; // é a divisão que você deseja
		}
		System.out.println("Binario: " +binario.reverse().toString()); // inve
    }
     
}
