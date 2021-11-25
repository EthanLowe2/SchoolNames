package lowe.schoolnames;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private TextField txtTest1;

    @FXML
    private TextField txtTest2;

    @FXML
    private TextField txtTest3;

    @FXML
    private TextField txtTest4;

    @FXML
    private TextField txtFirst;

    @FXML
    private Label lblStudent;
    
    
    @FXML
    private TextField txtLast;
    
    String Spots [][] = new String[15][6];
    
    int StudentNumber = 0; 

    @FXML
    void btnAdd(ActionEvent event) {
        Spots[StudentNumber][0]= ""+txtFirst;
        Spots[StudentNumber][1]= ""+txtLast;
        Spots[StudentNumber][2]= ""+txtTest1;
        Spots[StudentNumber][3]= ""+txtTest2;
        Spots[StudentNumber][4]= ""+txtTest3;
        Spots[StudentNumber][5]= ""+txtTest4;
        StudentNumber++;
    }

    @FXML
    void btnCAvrg(ActionEvent event) {
        
    }

    @FXML
    void btnList(ActionEvent event) {
        String output = "";
        for (int i=0; i <StudentNumber;i++){
            output=output +"Name: "+Spots[i][0]+ " "+ Spots[i][1]+" "+ Spots[i][2]+" "+ Spots[i][3]+" "+ Spots[i][4]+" "+ Spots[i][5] +"/n";
        }
    }

    @FXML
    void btnSAvrg(ActionEvent event) {
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
