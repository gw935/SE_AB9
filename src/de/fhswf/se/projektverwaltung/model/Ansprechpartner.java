package de.fhswf.se.projektverwaltung.model;

public class Ansprechpartner
{

   private Organisation organisation;

   /**
    * Email eines Ansprechpartners
    */
   private String email;

   public Ansprechpartner(String email, Organisation organisation)
   {
      this.email = email;
      this.organisation = organisation;
   }

   public String getEmail()
   {
      return this.email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public Organisation getOrganisation()
   {
      return organisation;
   }

   public void setOrganisation(Organisation organisation)
   {
      this.organisation = organisation;
   }

   @Override
   public String toString()
   {
      return "Ansprechpartner [organisation=" + organisation + ", email=" + email + "]";
   }

}