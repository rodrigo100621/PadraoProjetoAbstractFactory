/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author rodri
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField painel;
    @FXML
    private Button sete;
    @FXML
    private Button cinco;
    @FXML
    private Button nove;
    @FXML
    private Button seis;
    @FXML
    private Button um;
    @FXML
    private Button treis;
    @FXML
    private Button quatro;
    @FXML
    private Button hexadecimal;
    @FXML
    private Button dois;
    @FXML
    private Button oito;
    @FXML
    private Button binario;
    @FXML
    private Button octal;
    @FXML
    private Button zero;
    @FXML
    private Button apagar;
    @FXML
    private Button multiplicacao;
    @FXML
    private Button divisao;
    @FXML
    private Button mais;
    @FXML
    private Button menos;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           
    }    
       
    @FXML
    private void sete(ActionEvent event) {
     
        painel.setText(painel.getText().toString() + sete.getText());
    }

    @FXML
    private void cinco(ActionEvent event) {
    painel.setText(painel.getText().toString() + cinco.getText());
    }

    @FXML
    private void nove(ActionEvent event) {
    painel.setText(painel.getText().toString() + nove.getText());
    }

    @FXML
    private void seis(ActionEvent event) {
     painel.setText(painel.getText().toString() + seis.getText());
    }

    @FXML
    private void um(ActionEvent event) {
     painel.setText(painel.getText().toString() + um.getText());
    }

    @FXML
    private void tres(ActionEvent event) {
    painel.setText(painel.getText().toString() + treis.getText());
    }

    @FXML
    private void quatro(ActionEvent event) {
    painel.setText(painel.getText().toString() + quatro.getText());
    }
    @FXML
    private void zero(ActionEvent event) {
    painel.setText(painel.getText().toString() + zero.getText());
    }
    
    @FXML
    private void oito(ActionEvent event) {
    painel.setText(painel.getText().toString() + oito.getText());
    }
    @FXML
    private void dois(ActionEvent event) {
    painel.setText(painel.getText().toString() + dois.getText());
    }

    
    
    

    @FXML
    private void limpar(ActionEvent event) {
    
        painel.setText("");
    }

    @FXML
    private void multiplicacao(ActionEvent event) {
    painel.setText(painel.getText().toString() + multiplicacao.getText());
 
    }

    @FXML
    private void divisao(ActionEvent event) {
           painel.setText(painel.getText().toString() + divisao.getText());
 
    }

    @FXML
    private void mais(ActionEvent event) {
         painel.setText(painel.getText().toString() + mais.getText());
 
    }

    @FXML
    private void menos(ActionEvent event) {
        painel.setText(painel.getText().toString() + menos.getText());
 
    }
    
  
  
   
    @FXML
    private void hexadecimal(ActionEvent event) {
    
     String calc = painel.getText();
      
         ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
         ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
         Object obj = null;
        try {
            obj = engine.eval(calc);
        } catch (ScriptException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        painel.setText(String.valueOf(obj));
        
        double v = Double.parseDouble(painel.getText()); 
        
        int x = (int) v;
    
        
        OperacaoHexadecimal op = new OperacaoHexadecimal();
        AdapterCalcHexadecimal adapter = new AdapterCalcHexadecimal(op);
        adapter.converterResultado(x);
    
       
    }
 
    
     



    @FXML
    private void octa(ActionEvent event) {
        
        
         String calc = painel.getText();
      
         ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
         ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
         Object obj = null;
        try {
            obj = engine.eval(calc);
        } catch (ScriptException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        painel.setText(String.valueOf(obj));
        
        double v = Double.parseDouble(painel.getText()); 
        
        int x = (int) v;
    
         
        OperacaoOctal op = new OperacaoOctal();
        AdapterCalcOctal adapter = new AdapterCalcOctal(op);
        adapter.converterResultado(x);
    }

  @FXML
  public void binario(ActionEvent event){
  
        
         String calc = painel.getText();
      
         ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
         ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
         Object obj = null;
        try {
            obj = engine.eval(calc);
        } catch (ScriptException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        painel.setText(String.valueOf(obj));
        
        double v = Double.parseDouble(painel.getText()); 
        
        int x = (int) v;
    
        
        OperacaoBinaroa op = new OperacaoBinaroa();
        AdapterCalc adapter = new AdapterCalc(op);
        adapter.converterResultado(x);
        
     }     
  

}
