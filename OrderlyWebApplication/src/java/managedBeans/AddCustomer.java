package managedBeans;

import uis.CustomerUI;
import dtos.CustomerDTO;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "addCustomer")
@RequestScoped
public class AddCustomer {

  private CustomerUI customerUI = new CustomerUI();
  
  @Inject
  Customer customer;
  
  private int id;
  private String firstName;
  private String lastName;
  private String emailAddress;
  private String password;
  private String address;
  private String city;
  private String postcode;
  
  public AddCustomer() { }
  
  public String addCustomer() 
  {
    customer.setCustomerDetails
    (
      customerUI.addCustomer
      (
        new CustomerDTO
        (
                id,
                firstName,
                lastName,
                emailAddress,
                password,
                address,
                city,
                postcode
        )
      )
    );
    return "userAccount?faces-redirect=true";
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public void setFirstName(String firstName) 
  {
    this.firstName = firstName;
  }
  
  public void setLastName(String lastName) 
  {
    this.lastName = lastName;
  }
  
  public void setEmailAddress(String emailAddress) 
  {
    this.emailAddress = emailAddress;
  }
  
  public void setPassword(String password) 
  {
    this.password = password;
  }
  
  public void setAddress(String address) 
  {
    this.address = address;
  }
  
  public void setCity(String city) 
  {
    this.city = city;
  }
  
  public void setPostcode(String postcode) 
  {
    this.postcode = postcode;
  }
  
  public int getId() {
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
