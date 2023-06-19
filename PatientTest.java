package vet_clinic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import your.package.path.Patients;

public class PatientTest {

  @Test
  public void testGettersAndSetters() {
    Patients patient = new Patients();
    patient.setChip_Id(1);
    patient.setName("Kivi");
    patient.setBreed("Scottish");
    patient.setType("Cat");
    patient.setColour("White");
    patient.setDateOfBirth("2020-02-11");
    patient.setAge(3);
    patient.setOwnerName("Otto Bauer");
    patient.setContactNumber("1234567890");


    Assertions.assertEquals(1, patient.getChipId());
    Assertions.assertEquals("Kivi", patient.getName());
    Assertions.assertEquals("Scottish", patient.getBreed());
    Assertions.assertEquals("Cat", patient.getType());
    Assertions.assertEquals("White", patient.getColour());
    Assertions.assertEquals("2020-02-11", patient.getDateOfBirth());
    Assertions.assertEquals(3, patient.getAge());
    Assertions.assertEquals("Otto Bauer", patient.getOwnerName());
    Assertions.assertEquals("1234567890", patient.getContactNumber());

  }
}