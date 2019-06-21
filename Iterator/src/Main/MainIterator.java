/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;   
/**
 *
 * @author hugo
 */

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import Iterator.Aluno;


public class MainIterator {
    

public static void main(String[] args) {

		
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		Aluno aluno = null;
		
		//Alimentando a coleção com objetos Aluno
		for (int i=0; i<17; i++){
		listaAluno.add(new Aluno("Aluno"+i,"Endereco"+i,"Email"+i,i));			
		}
		
		System.out.println();
		System.out.println();
		
		//Aplicando o padrão Iterator
		Iterator<Aluno> itrAluno = listaAluno.iterator();
		
		
		while(itrAluno.hasNext()){
			aluno = (Aluno) itrAluno.next();
			
                        System.out.println("===================");
			System.out.println("Nome: "+aluno.getNome());
			System.out.println("Endereço: "+aluno.getEndereco());
                        System.out.println("Email:  "+aluno.getEmail());
			System.out.println("Matrícula: "+aluno.getMatricula());
			
		}
		
		
		

	}

}