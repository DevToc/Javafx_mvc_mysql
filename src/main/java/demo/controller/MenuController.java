package demo.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController implements Initializable {

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {

  }

  @FXML
  public void handleJobAction() {

    Parent root;
    try {
      root = FXMLLoader.load(getClass().getResource("/demo/view/job.fxml"));
      Scene scene = new Scene(root, 840, 500);
      Stage stage = new Stage();
      stage.setTitle("Jobs");
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
