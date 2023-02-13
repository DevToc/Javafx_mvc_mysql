package demo.controller;

import java.net.URL;
import java.util.ResourceBundle;
import demo.app.DBConnection;
import demo.model.Job;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DateCell;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class JobController implements Initializable {

  @FXML
  private Label label2;

  @FXML
  private TableView<Job> table_Job;

  @FXML
  private TableColumn<Job, Integer> col_id;

  @FXML
  private TableColumn<Job, Integer> col_envelopid;

  @FXML
  private TableColumn<Job, Integer> col_customerid;

  @FXML
  private TableColumn<Job, String> col_direction;

  @FXML
  private TableColumn<Job, DateCell> col_created;

  @FXML
  private TableColumn<Job, String> col_type;

  @FXML
  private TableColumn<Job, String> col_edifactreleasechar;

  @FXML
  private TableColumn<Job, String> col_paddedcontrolnumber;

  ObservableList<Job> jobs;
  DBConnection connection;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    connection = new DBConnection();
    jobs = connection.getDatausers();
    System.out.println(jobs);
    col_id.setCellValueFactory(new PropertyValueFactory<Job, Integer>("id"));
    col_customerid.setCellValueFactory(new PropertyValueFactory<Job, Integer>("CustomerId"));
    col_envelopid.setCellValueFactory(new PropertyValueFactory<Job, Integer>("EnvelopeId"));
    col_direction.setCellValueFactory(new PropertyValueFactory<Job, String>("direction"));
    col_created.setCellValueFactory(new PropertyValueFactory<Job, DateCell>("CreatedDateUtc"));
    col_type.setCellValueFactory(new PropertyValueFactory<Job, String>("edi_type"));
    col_edifactreleasechar.setCellValueFactory(new PropertyValueFactory<Job, String>("edifact_release_char"));
    col_paddedcontrolnumber.setCellValueFactory(new PropertyValueFactory<Job, String>("padded_control_number"));
    table_Job.getItems().setAll(jobs);
  }

}