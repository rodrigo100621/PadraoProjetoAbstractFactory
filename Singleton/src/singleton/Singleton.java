/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author rodri
 */
public class Singleton {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Presidencia p1 = Presidencia.getIntance();
      p1.setnomepresidente("Bolsonaro");
      System.out.println("Presidente 1 " + p1.getNomePresidente());

      Presidencia p2 = Presidencia.getIntance();
      p2.setnomepresidente("Lula");
      System.out.println("Presidente 2 " + p2.getNomePresidente());
     
    }
    
}
