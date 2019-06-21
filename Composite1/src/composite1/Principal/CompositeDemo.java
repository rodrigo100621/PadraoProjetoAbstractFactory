/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite1.Principal;

import composite.Aluno;
import composite.Turma;

class CompositeDemo {
    
public static void main(String[] args){
		 Aluno aluno1 = new Aluno("Gabriela:",20190128);
		 
		 Aluno aluno2 = new Aluno("Wanderson:",20190130);
		 
		 Aluno aluno3 = new Aluno("Hugo:",20190131);


		 Turma novaTurma = new Turma(" TSI 2019");
		 novaTurma.adicionaAluno(aluno1);
		 novaTurma.adicionaAluno(aluno2);
		 novaTurma.adicionaAluno(aluno3);
		 
		 
		 Aluno aluno4 = new Aluno("Rodrigo:",20190132);
		 Aluno aluno5 = new Aluno("Guilherme:",20190133);
		 
		 novaTurma.adicionaAluno(aluno4);
		 novaTurma.adicionaAluno(aluno5);
		 
		 novaTurma.removeAluno(aluno1);
		 novaTurma.removeAluno(aluno2);
		 
		 
		 
	     System.out.println("Alunos do Curso:"+novaTurma.getIdTurma());
	     
	      for (Aluno aluno : novaTurma.getListaAlunos()) {
	         System.out.println(aluno.getNome() + "  "+ aluno.getMatricula());
	         
	      }
	}
}