/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author rodri
 */
public class ConcessionariaConstrucao {
    
    protected MotoBuilder montadora;
   
 
    public ConcessionariaConstrucao(MotoBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirMoto() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }
 
    public Moto getMoto() {
        return montadora.getMoto();
    }
}
