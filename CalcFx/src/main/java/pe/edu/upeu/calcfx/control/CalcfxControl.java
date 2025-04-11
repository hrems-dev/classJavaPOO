package pe.edu.upeu.calcfx.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import javax.swing.plaf.basic.BasicButtonUI;

@Controller
public class CalcfxControl {
    @FXML
    private TextField txtResultado;

    private void escribirNuemero(String numero){
        txtResultado.appendText(numero);// concatenr el texto agregando

         }

         @FXML
    private void controlClick(ActionEvent event){
             Button boton=(Button) event.getSource();
             switch (boton.getId()) {
                 case "btn0", "btn1", "btn2", "btn3", "btn4", "btn5", "btn6", "btn7", "btn8", "btn9": {
                     escribirNuemero(boton.getText());
                 }
                 break;
                 default: {
                 }
                 break;
             }
         }
}
