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
public interface Imposto {
	double calcula(Orcamento orcamento);
        ////Calculo de todos os impostos feitos através do Orcamento Inicial.
        ////A interface se torna comum para todas subclasses suportadas, onde esta interface usa para
        ////chamar todas classes definidas atraves do "orcamento" do imposto. ICCC
}