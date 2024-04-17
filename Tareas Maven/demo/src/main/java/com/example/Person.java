package com.example;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public Person(String firstName, String lastName, LocalDate birthDate){
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthDate = birthDate;
    }

    public void setFirstName(String firstName ){
        this.firstName = firstName;
    }

    public String getFirstName(){
      return this.firstName;
    }
 
    public void setLastName(String lastName){
     this.lastName = lastName;
    }


    public String getLastName(){
      return this.lastName;
    }
    
    public void setBirthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
  }
  
  public LocalDate getBirthDate() {
    return birthDate;
}


    public int calculateAge(){
      return LocalDate.now().getYear() - this.birthDate.getYear();
    }
    

    // public LocalDate calculateAge() {
    //   return this.birthDate;
    // }
    

}
