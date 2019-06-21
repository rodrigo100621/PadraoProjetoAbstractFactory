/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy1;

/**
 *
 * @author hugo
 */
public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return 50 + (orcamento.getValor() * 0.09);
	}

}

////Elimina comando condicionais no codigos