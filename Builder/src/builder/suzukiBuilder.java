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
public class suzukiBuilder extends MotoBuilder{

    @Override
    public void buildPreco() {
    moto.preco = 29000.00;
    
    }

    @Override
    public void buildDscMotor() {
    moto.motor = "Motor flex comum";
    }

    @Override
    public void buildAnoDeFabricacao() {
    moto.anoDeFabricacao = 2011;
    }

    @Override
    public void buildModelo() {
    moto.modelo  = "suzuki 600 CV";
    }

    @Override
    public void buildMontadora() {
        
     moto.montadora = "suzuki";
    }
    
}


