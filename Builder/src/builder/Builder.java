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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     ConcessionariaConstrucao concessionaria = new ConcessionariaConstrucao(
            new HondaBuilder());
 
    concessionaria.construirMoto();
    
    Moto moto = concessionaria.getMoto();
    System.out.println("Moto: " + moto.modelo + "/" + moto.montadora
            + "\nAno: " + moto.anoDeFabricacao + "\nMotor: "
            + moto.motor + "\nValor: " + moto.preco);
 
    System.out.println("-------------------------------------------------------");
 
    concessionaria = new ConcessionariaConstrucao(new yamahaBuilder());
    concessionaria.construirMoto();
    moto = concessionaria.getMoto();
    System.out.println("moto: " + moto.modelo + "/" + moto.montadora
            + "\nAno: " + moto.anoDeFabricacao + "\nMotor: "
            + moto.motor + "\nValor: " + moto.preco);
    
    
     System.out.println("-------------------------------------------------------");
 
    concessionaria = new ConcessionariaConstrucao(new suzukiBuilder());
    concessionaria.construirMoto();
    moto = concessionaria.getMoto();
    System.out.println("moto: " + moto.modelo + "/" + moto.montadora
            + "\nAno: " + moto.anoDeFabricacao + "\nMotor: "
            + moto.motor + "\nValor: " + moto.preco);
    
    }
    
}
