package de.fhswf.se.projektverwaltung;

public class Ansprechpartner
{

   private String organisation;

   /**
    * Email eines Ansprechpartners
    */
   private String email;

   public Ansprechpartner(String email, String organisation)
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

   public String getOrganisation()
   {
      return organisation;
   }

   public void setOrganisation(String organisation)
   {
      this.organisation = organisation;
   }

   @Override
   public String toString()
   {
      return "Ansprechpartner [organisation=" + organisation + ", email=" + email + "]";
   }

}