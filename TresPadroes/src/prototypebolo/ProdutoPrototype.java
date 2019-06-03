/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypebolo;

/**
 *
 * @author rodri
 */
public abstract  class ProdutoPrototype {
    
    protected String modelo;
    protected String informaçao;
    protected double valor;
    


    public abstract void exibirInformacao();

    public abstract ProdutoPrototype clonar();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public String getInformaçao() {
        return informaçao;
    }

    public void setInformaçao(String informaçao) {
        this.informaçao = informaçao;
    }
}
