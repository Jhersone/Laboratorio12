/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Proyector
 */
public class CajaValida {
    
    private JLabel lblError;
    private JTextField txtCaja;

    public CajaValida(JLabel lblError, JTextField txtCaja) {
        this.lblError = lblError;
        this.txtCaja = txtCaja;
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JTextField getTxtCaja() {
        return txtCaja;
    }

    public void setTxtCaja(JTextField txtCaja) {
        this.txtCaja = txtCaja;
    }
    
    
    
    
    public float getNumero( ){
    lblError.setText("");
    String num2 = txtCaja.getText();
    
    //aqui vamos a comenzar a aplicar la excepcion
    
    try{
      return Float.parseFloat(num2);
    }catch(NumberFormatException ex){
        lblError.setText("Numero Invalido");
    }
    return 0;
    }
    
    
}
