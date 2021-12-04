package de.fhswf.se.personalverwaltung;

public class Mitarbeiter
{

   /**
    * Der Vorname eines Mitarbeiters
    */
   private String vorname;

   /**
    * Nachname eines Mitarbeiters
    */
   private String nachname;

   /**
    * Postleitzahl eines Mitarbeiters
    */
   private String plz;

   /**
    * Wohnort eines Mitarbeiters
    */
   private String ort;

   /**
    * Strasse eines Mitarbeiters
    */
   private String strasse;

   public String getVorname()
   {
      return this.vorname;
   }

   public void setVorname(String vorname)
   {
      this.vorname = vorname;
   }

   public String getNachname()
   {
      return this.nachname;
   }

   public void setNachname(String nachname)
   {
      this.nachname = nachname;
   }

   public String getPlz()
   {
      return this.plz;
   }

   public void setPlz(String plz)
   {
      this.plz = plz;
   }

   public String getOrt()
   {
      return this.ort;
   }

   public void setOrt(String ort)
   {
      this.ort = ort;
   }

   public String getStrasse()
   {
      return this.strasse;
   }

   public void setStrasse(String strasse)
   {
      this.strasse = strasse;
   }

}