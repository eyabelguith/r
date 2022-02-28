/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campination.gestionuser.gui;

import campination.gestionuser.Entity.Transporteur;
import campination.gestionuser.Services.TransporteurServices;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Eya
 */
public class InterfaceListTransporteurController implements Initializable {
   ObservableList<Transporteur> List;
    @FXML
    private AnchorPane navbar;
    @FXML
    private Button button;
    @FXML
    private TableColumn<Transporteur, String> colNom;
    @FXML
    private TableColumn<Transporteur, String> colCin;
   
    @FXML
    private TableColumn<Transporteur, String> colNum;
    @FXML
    private TableColumn<Transporteur, String> colG;
    @FXML
    private TableColumn<Transporteur, String> colT;
    @FXML
    private TableColumn<Transporteur, String> colC;
    @FXML
    private TableColumn<Transporteur, String> colM;
    @FXML
    private TableColumn<Transporteur, String> colRole;
    @FXML
    private TableView<Transporteur> TableT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colNom.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("nom"));
         colCin.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("cin"));
         colNum.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("num_tel"));
         colG.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("gouvernorat"));
         colT.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("moyenT"));
           colC.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("capacite"));
            colM.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("matricule"));
             colRole.setCellValueFactory(new PropertyValueFactory<Transporteur, String>("role"));
             
        
       
        TableT.setItems(des());
    }    
    public ObservableList<Transporteur> des(){
        TransporteurServices dest = new TransporteurServices();
        ObservableList<Transporteur> Transporteur = FXCollections.observableArrayList(dest.AfficherTransporteur());
              
     return Transporteur;   
    }
}
