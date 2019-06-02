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
public class yamahaBuilder extends MotoBuilder{

    @Override
    public void buildPreco() {
    moto.preco = 10000.00;
    
    }

    @Override
    public void buildDscMotor() {
    moto.motor = "Motor gasolina comum";
    }

    @Override
    public void buildAnoDeFabricacao() {
    moto.anoDeFabricacao = 2017;
    }

    @Override
    public void buildModelo() {
    moto.modelo  = "factor YBR 125";
    }

    @Override
    public void buildMontadora() {
        
     moto.montadora = "yamaha";
    }
    
}
