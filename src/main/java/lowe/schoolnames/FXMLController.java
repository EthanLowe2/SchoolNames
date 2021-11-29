package lowe.schoolnames;

/*
School listing program using 2D Arrays
Ethan Lowe
11/29/2021
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private TextField txtTest1, txtTest2, txtTest3, txtTest4, txtFirst, txtLast;

    @FXML
    private Label lblStudent, lblAv;

    String Spots[][] = new String[15][6];

    int StudentNumber = 0;

    @FXML
    void btnAdd(ActionEvent event) {
        if (!txtFirst.getText().equals("") && !txtLast.getText().equals("") && !txtTest1.getText().equals("") && !txtTest2.getText().equals("") && !txtTest3.getText().equals("") && !txtTest4.getText().equals("")) {
            Spots[StudentNumber][0] = "" + txtFirst.getText();
            Spots[StudentNumber][1] = "" + txtLast.getText();
            Spots[StudentNumber][2] = "" + txtTest1.getText();
            Spots[StudentNumber][3] = "" + txtTest2.getText();
            Spots[StudentNumber][4] = "" + txtTest3.getText();
            Spots[StudentNumber][5] = "" + txtTest4.getText();
            StudentNumber++;
            btnList(event);
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Alert");
            alert.setHeaderText(null);
            alert.setContentText("Please Check your text boxes");
            alert.showAndWait();
        }
    }

    @FXML
    void btnCAvrg(ActionEvent event) {
        int testavg = 0;
        int output;
        if (StudentNumber != 0) {
            for (int i = 0; i < StudentNumber; i++) {
                testavg = testavg + (Integer.parseInt(Spots[i][2]) + Integer.parseInt(Spots[i][3]) + Integer.parseInt(Spots[i][4]) + Integer.parseInt(Spots[i][5])) / 4;
            }
            output = testavg / StudentNumber;
            lblAv.setText("" + output);
        }
    }

    @FXML
    void btnList(ActionEvent event) {
        String output = "";
        for (int i = 0; i < StudentNumber; i++) {
            output = output + "Name: " + Spots[i][0] + " " + Spots[i][1] + "     " + Spots[i][2] + " " + Spots[i][3] + " " + Spots[i][4] + " " + Spots[i][5] + "\n";
        }
        lblStudent.setText(output);
    }

    @FXML
    void btnSAvrg(ActionEvent event) {
        String currentstudentfirst = "";
        String currentstudentlast = "";
        currentstudentfirst = txtFirst.getText();
        currentstudentlast = txtLast.getText();
        for (int finding = 0; finding < StudentNumber; finding++) {
            if (Spots[finding][0].equalsIgnoreCase(currentstudentfirst) && Spots[finding][1].equalsIgnoreCase(currentstudentlast)) {
                int test1 = Integer.parseInt(Spots[finding][2]);
                int test2 = Integer.parseInt(Spots[finding][3]);
                int test3 = Integer.parseInt(Spots[finding][4]);
                int test4 = Integer.parseInt(Spots[finding][5]);
                int finish1;
                int finish2;
                finish1 = test1 + test2 + test3 + test4;
                finish2 = finish1 / 4;
                lblAv.setText("" + finish2);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
