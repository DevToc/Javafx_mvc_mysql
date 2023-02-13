package demo.model;

import java.util.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Job {
  private final IntegerProperty id = new SimpleIntegerProperty();
  private final IntegerProperty EnvelopeId = new SimpleIntegerProperty();
  private final IntegerProperty CustomerId = new SimpleIntegerProperty();
  private final StringProperty direction = new SimpleStringProperty();
  private final ObjectProperty<Date> CreatedDateUtc = new SimpleObjectProperty<>();
  private final StringProperty edi_type = new SimpleStringProperty();
  private final StringProperty edifact_release_char = new SimpleStringProperty();
  private final StringProperty padded_control_number = new SimpleStringProperty();

  public Job(Integer Id, Integer EnvelopeId, Integer customerid, String direct, Date created, String typeed,
      String fact,
      String padded) {
    setId(Id);
    setEnvelopeId(EnvelopeId);
    // CustomerId.set(customerid);
    setCustomerId(customerid);
    setDirection(direct);
    // CreatedDateUtc.set(created);
    setCreatedDateUtc(created);
    // edi_type.set(type);
    setEdiType(typeed);
    // edifact_release_char.set(fact);
    setEidFactRelease(fact);
    // padded_control_number.set(padded);
    setPaddedControlNumber(padded);
  }

  public Integer getId() {
    return id.get();
  }

  public void setId(Integer value) {
    id.set(value);
  }

  public Integer getEnvelopeId() {
    return EnvelopeId.get();
  }

  public void setEnvelopeId(Integer value) {
    EnvelopeId.set(value);
  }

  public Integer getCustomerId() {
    return CustomerId.get();
  }

  public void setCustomerId(Integer value) {
    CustomerId.set(value);
  }

  public String getDirection() {
    return direction.get();
  }

  public void setDirection(String value) {
    direction.set(value);
  }

  public Date getCreatedDateUtc() {
    return CreatedDateUtc.get();
  }

  public void setCreatedDateUtc(Date value) {
    CreatedDateUtc.set(value);
  }

  public String getEdi_type() {
    return edi_type.get();
  }

  public void setEdiType(String value) {
    edi_type.set(value);
  }

  public String getEdifact_release_char() {
    return edifact_release_char.get();
  }

  public void setEidFactRelease(String value) {
    edifact_release_char.set(value);
  }

  public String getPadded_control_number() {
    return padded_control_number.get();
  }

  public void setPaddedControlNumber(String value) {
    padded_control_number.set(value);
  }

}