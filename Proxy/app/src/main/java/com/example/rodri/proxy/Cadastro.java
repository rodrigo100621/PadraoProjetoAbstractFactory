package com.example.rodri.proxy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    Button cadastro;
    EditText nome,email,telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);



         cadastro = (Button)findViewById(R.id.cadastrar);
         nome = (EditText)findViewById(R.id.nome);
         email = (EditText)findViewById(R.id.email);
         telefone = (EditText)findViewById(R.id.telefone);


         cadastro.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 cadastro(nome.getText().toString(),email.getText().toString(),telefone.getText().toString());

             }
         });
    }

    public  void cadastro(String nome,String email,String telefone){

         String arquivo = "arquivo";
        SharedPreferences.Editor preferences =
                getSharedPreferences(arquivo,MODE_PRIVATE).edit();

        preferences.putString("nome",nome.toString());
        preferences.putString("email",email.toString());
        preferences.putString("telefone",telefone.toString());
        preferences.commit();
    }
}
