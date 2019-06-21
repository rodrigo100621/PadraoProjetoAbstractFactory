/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;
/**
 *
 * @author hugo
 */
public class Aluno {
	
	private String nome;
	private String endereco;
        private String email;
	private int matricula;
      
	
	
	public Aluno(String nome, String endereco,String email, int matricula){
		this.nome = nome;
		this.endereco = endereco;
                this.email = email;
		this.matricula = matricula;
                
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
        public String getEmail() {
		return email;
        }        
        public void setEmail(String email) {
		this.email = email;
        }        
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
               
        		

}