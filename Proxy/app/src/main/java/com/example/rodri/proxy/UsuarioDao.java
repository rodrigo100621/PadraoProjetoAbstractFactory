package com.example.rodri.proxy;

import android.content.Context;

class UsuarioDao {


    public static Usuario getUsuario(String arquivo,String nome,String telefone,String email){
       // System.out.println("select * from PESSOA where id="+id);
        return new UsuarioImplementado(arquivo,nome,email,telefone);
    }
}
