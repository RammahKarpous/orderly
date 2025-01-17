package dtos;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
  
  private final int id;
  private final String firstName;
  private final String lastName;
  private final String emailAddress;
  private final String password;
  private final String address;
  private final String city;
  private final String postcode;
  
  public CustomerDTO( int id, String firstName, String lastName, String emailAddress, String password, String address, String city, String postcode ) 
  {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.password = password;
    this.address = address;
    this.city = city;
    this.postcode = postcode;
  }
  
  public int getId()
  {
    return id;
  }
  
  public String getFirstName() 
  {
    return firstName;
  }
  
  public String getLastName() 
  {
    return lastName;
  }
  
  public String getEmailAddress() 
  {
    return emailAddress;
  }
  
  public String getPassword() 
  {
    return password;
  }
  
  public String getAddress() {
    return address;
  }
  
  public String getCity() {
    return city;
  }
  
  public String getPostcode() {
    return postcode;
  }
}
