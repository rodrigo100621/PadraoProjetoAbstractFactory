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
public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.08;
                //// A taxa de imposto pode ser alterada estrategicamente onde o calculo ja eibe o resultado. 
	}

}