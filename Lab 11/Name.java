// Program: Name.java
// Author: Jared Suda
// Last Modified: April 2, 2021
// Desc.: Working with Classes

public class Name {
   private String first, middle, last;
   
   public Name(String first, String middle, String last) {
      this.first = first;
      this.middle = middle;
      this.last = last;
   }
   
   // get normal order
   public String getNormalOrder() {
      return first + " " + middle + " " + last;
   }
   
   // get reverse order
   public String getReverseOrder() {
      return last + " " + first + " " + middle;
   }
   
   //get first name
   public String getFirstName() {
      return first;
   }
   
   // get last name
   public String getLastName() {
      return last;
   }
   
   // get middle name
   public String getMiddleName() {
      return middle;
   }
   
   // set first name
   public void setFirstName(String first) {
      this.first = first;
   }
   
   // set last name
   public void setLastName(String last) {
      this.last = last;
   }
   
   // set middle initial
   public void setMiddleName(String middle) {
      this.middle = middle;
   }
   
   // toString method
   public String toString(){  
      return this.first + " " + this.middle + " " + this.last;  
   } 
   
}