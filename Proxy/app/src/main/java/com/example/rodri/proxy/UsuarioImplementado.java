package com.example.rodri.proxy;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class UsuarioImplementado  implements  Usuario{

    private String arquivo;
    private String nome;
    private String email;
    private String telefone;
    Context context;

   public  UsuarioImplementado(String arquivo,String nome,String email,String telefone){

        this.arquivo = arquivo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;


        bucarArquivosPreferens(nome,email,telefone);
    }


    public void bucarArquivosPreferens(String nome,String email,String telefone){

        System.out.println("nome:" + nome);
        System.out.println("Email:" + email);
        System.out.println("telefone:" + telefone);

        Log.d("Nome:",nome);
        Log.d("Nome:",email);
        Log.d("Nome:",telefone);

    }


    @Override
    public String getArquivo() {

        return arquivo;
    }

    @Override
    public String getNome() {
      return nome;
    }


    @Override
    public String getEmail() {

        return email;
    }

    @Override
    public String getTelefone() {
       return telefone;
    }
}
