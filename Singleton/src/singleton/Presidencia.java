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
public class Presidencia {
    
   private volatile static Presidencia uniqueintance;
   
   private String nomePresidente;

   private Presidencia() {}

   public void setnomepresidente(String nomePresidente){
	   this.nomePresidente = nomePresidente;
   }
   public String getNomePresidente(){
	   return nomePresidente; 
	}
   //verifica se o objeto esta null
   public static Presidencia getIntance(){
       
       //verifica se o objeto esta null
	   if(uniqueintance == null){
		   uniqueintance = new Presidencia();
		}
	   return uniqueintance;
   	}	
}

