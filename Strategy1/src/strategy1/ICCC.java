/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy1;

/**
 *
 * @author 0422
 */
public class ICCC implements Imposto {
	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		
		if(valor  < 1000.0) {
			return valor  * 0.0;
		}
		else if(orcamento.getValor() < 3000.0) {
			return valor  * 0.07;
		} else {
			return 30 + valor * 0.08;
		}
	}

}
