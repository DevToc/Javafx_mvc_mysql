package demo.app;

import java.sql.*;

import demo.model.Job;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DBConnection {

  public static Connection Connect() {
    try {

      String url = "jdbc:mysql://localhost:3306/dbo?verifyServerCertificate=false&useSSL=true";
      String user = "root";
      String password = "";
      Connection connection;
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(url, user, password);
      return connection;

    } catch (ClassNotFoundException | SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
    }
    return null;
  }

  public static ObservableList<Job> getDatausers() {
    Connection conn = Connect();
    ObservableList<Job> list = FXCollections.observableArrayList();
    try {
      PreparedStatement ps = conn.prepareStatement("select * from edi_envelope");
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        list.add(new Job(Integer.parseInt(rs.getString("id")), Integer.parseInt(rs.getString("EnvelopId")),
            Integer.parseInt(rs.getString("CustomerId")), rs.getString("direction"), rs.getDate("CreatedDateUtc"),
            rs.getString("edi_type"), rs.getString("edifact_release_char"), rs.getString("padded_control_number")));
      }
    } catch (Exception e) {
    }
    return list;
  }

}