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
public class Main {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
                Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
                calculador.realizaCalculo(orcamento, iccc);
	}
}

////define muitos comportamentos e por sua vez, eles aparecem com comando adcionais
////onde são movida e referenciados para sua propiaa classe.
////Desvantagens- fica complicado saber se recebem 
//// aumenta os objetos no sistema.