package de.fhswf.se.projektverwaltung.model;

public class Student
{
   private String email;

   public String getEmail()
   {
      return this.email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public Student(String email)
   {
      this.email = email;
   }

   @Override
   public String toString()
   {
      return "Student [email=" + email + "]";
   }

}