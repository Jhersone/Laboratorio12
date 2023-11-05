/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Proyector
 */
public class Operacion {
    
    private float valor1;
    private float valor2;
    
    private CajaValida caja1;
    private CajaValida caja2;
    private CajaValida resultado;

    public Operacion(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public Operacion(){
    
    }

    public Operacion( CajaValida caja1, CajaValida caja2) { 
        this.caja1 = caja1;
        this.caja2 = caja2;
    }

    public Operacion(CajaValida caja1, CajaValida caja2, CajaValida resultado) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }



    
    public void mostrarResultadoDivision(){
        
      JTextField caja =  resultado.getTxtCaja();
      JLabel labelError = resultado.getLblError();
    
      valor1 = caja1.getNumero();
      valor2 = caja2.getNumero();
      
    if(valor1==0 && valor2==0 ){
        String text = ("No se puede dividir cero entre cero");
        labelError.setText(text);
        caja.setText("");
        JOptionPane.showMessageDialog(null,text,"",
          JOptionPane.ERROR_MESSAGE);
              
        }else if(valor2 == 0){
        String text = ("No se puede entre cero");
        labelError.setText(text);
        caja.setText("");
        }else {
        float division = division();
        caja.setText(division + "");
        
        }

    }
    
        public void mostrarResultadoSuma(){
        
      JTextField caja =  resultado.getTxtCaja();
      JLabel labelError = resultado.getLblError();
    
      valor1 = caja1.getNumero();
      valor2 = caja2.getNumero();
      
    
        float sum = suma();
        caja.setText(sum + "");
   
    }
        
    public void mostrarResultadoMultiplicacion(){
        
      JTextField caja =  resultado.getTxtCaja();
      JLabel labelError = resultado.getLblError();
    
      valor1 = caja1.getNumero();
      valor2 = caja2.getNumero();
      
    
        float mul = multiplicacion();
        caja.setText(mul + "");
   
    }
    
    
      public void mostrarResultadoResta(){
        
      JTextField caja =  resultado.getTxtCaja();
      JLabel labelError = resultado.getLblError();
    
      valor1 = caja1.getNumero();
      valor2 = caja2.getNumero();
      
    
        float resta = resta();
        caja.setText(resta + "");
   
    }
        
        
        
        
    
    
       public float getNumero(JTextField caja , JLabel labelError ){
        labelError.setText("");
    String num2 = caja.getText();
    
    //aqui vamos a comenzar a aplicar la excepcion
    
    try{
      return Float.parseFloat(num2);
    }catch(NumberFormatException ex){
        labelError.setText("Numero Invalido");
    }
    return 0;
    }
    
    
    
    
    
    
    
    public float suma(){
    
    return valor1+valor2;
    
    }
      public float resta(){
    
    return valor1-valor2;
    
    }
    
    public float multiplicacion(){
    
    return valor1*valor2;
    
    }
      public float division(){
    
    return valor1/valor2;
    
    }
    
    
}
