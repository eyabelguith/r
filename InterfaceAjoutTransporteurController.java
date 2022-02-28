/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campination.gestionuser.gui;

import campination.gestionuser.Entity.Coach;
import campination.gestionuser.Entity.Transporteur;
import campination.gestionuser.Services.CoachServices;
import campination.gestionuser.Services.TransporteurServices;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Eya
 */
public class InterfaceAjoutTransporteurController implements Initializable {

    @FXML
    private AnchorPane navbar;
    @FXML
    private Button navItem;
    @FXML
    private Button button;
    @FXML
    private TextField nom;
    @FXML
    private TextField cin;

    @FXML
    private TextField num_tel;
    @FXML
    private TextField go;
    @FXML
    private TextField trans;
    @FXML
    private TextField cap;
    @FXML
    private TextField mat;
    @FXML
    private TextField role;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterTransporteur(ActionEvent event) {
        TransporteurServices ts=new TransporteurServices();
        Transporteur t=new Transporteur();
        t.setNom(nom.getText());
       t.setCin(Integer.parseInt(cin.getText()));
       t.setNum_tel(Integer.parseInt(num_tel.getText()));
        t.setGouvernorat(go.getText());
        t.setMoyenT(trans.getText());
        t.setMatricule(mat.getText());
        t.setRole(role.getText());
       ts.AjouterTranporteur(t);
        
        
    
      Annuler();
    }

    private void Annuler() {
         nom.clear();
        cin.clear();

        num_tel.clear();
        go.clear();
        trans.clear();
        mat.clear();
        role.clear();
    
        
    }

    @FXML
    private void retourner(ActionEvent event) {
    }
 

    
}
