/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodbiscoito;

/**
 *
 * @author rodri
 */
public class Biscoito implements IFabricaBiscoitos {

    @Override
    public IBiscoito criarProdutos(String biscoitos) {
     if (biscoitos.equals("leite")){
         
            return new Biscoitoleite();
        
     }else if (biscoitos.equals("mabel")){
            return new BicoitoMabel();
            
        }else if (biscoitos.equals("nestle")){
            
            return new BiscoitoNestle();
        
        }else if (biscoitos.equals("nesfit")){
            return new BicoitoNesfit();
            
        }else if (biscoitos.equals("marilan")){
            return new BiscoitoMarilan();
            
        }else {
            return null;
        }
    }
    
    }
    

