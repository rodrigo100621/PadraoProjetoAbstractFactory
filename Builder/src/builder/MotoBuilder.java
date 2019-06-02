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
public abstract class MotoBuilder {
 
     protected Moto moto;
 
    public MotoBuilder() {
        moto = new Moto();
    }
 
    public abstract void buildPreco();
 
    public abstract void buildDscMotor();
 
    public abstract void buildAnoDeFabricacao();
 
    public abstract void buildModelo();
 
    public abstract void buildMontadora();
 
    public Moto getMoto() {
        return moto;
    }
    
    
}
