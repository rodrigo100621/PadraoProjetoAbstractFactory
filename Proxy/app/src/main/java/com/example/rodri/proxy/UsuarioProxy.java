package com.example.rodri.proxy;

import android.content.Context;
import android.util.Log;

public class UsuarioProxy implements  Usuario {

    private Usuario usuario;
    private String nome;
    private String telefone;
    private String email;
    private String arquivo;


    public UsuarioImplementado usuarioReal;
    public Context ctx;
    public  UsuarioProxy(String arquivo,String nome,String email,String telefone){

        this.arquivo = arquivo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

        if(arquivo.equals("arquivo")){
            usuarioReal = new UsuarioImplementado(arquivo, nome, email, telefone);
        }else{

            System.out.println("Carregando Arquivo.......");
            Log.d("Buncando","Carregando Arquvi.....");
        }
        }

    @Override
    public String getArquivo() {
        if (usuario == null) {
            //Apenas cria o objeto real quando chamar este método
            usuario = UsuarioDao.getUsuario(this.arquivo,this.nome,this.email,this.telefone);
        }
        return usuario.getArquivo();
    }

    @Override
    public String getNome() {
        if (usuario == null) {
            //Apenas cria o objeto real quando chamar este método
            usuario = UsuarioDao.getUsuario(this.arquivo,this.nome,this.email,this.telefone);
        }
        return usuario.getNome();
    }

    @Override
    public String getEmail() {
        if (usuario == null) {
            //Apenas cria o objeto real quando chamar este método
            usuario = UsuarioDao.getUsuario(this.arquivo,this.nome,this.email,this.telefone);
        }
        return usuario.getEmail();
    }


    @Override
    public String getTelefone() {
        if (usuario == null) {
            //Apenas cria o objeto real quando chamar este método
            usuario = UsuarioDao.getUsuario(this.arquivo,this.nome,this.email,this.telefone);
        }
        return usuario.getTelefone();
    }
}
