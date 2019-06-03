/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydoce;

/**
 *
 * @author rodri
 */
public class FabricaNestle implements FabricaDoce{

    @Override
    public DoceComum doceComum() {
    
         return new DoceAmendoin();
    }

    @Override
    public DoceLigth doceLight() {
        
         return new DoceGoiaba();
    }
    
}
