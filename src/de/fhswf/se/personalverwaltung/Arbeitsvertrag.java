package de.fhswf.se.personalverwaltung;

import java.sql.Date;

public class Arbeitsvertrag
{

   /**
    * Beginn des Arbeitsvertrages Date(int year, int month, int date)
    */
   private Date beginn;

   /**
    * Ende eines Arbeitsvertrages Date(int year, int month, int date)
    */
   private Date ende;

   /**
    * Woechentliche Stunden einer Arbeitskraft
    */
   private double woechentlicheStunden;

   public Date getBeginn()
   {
      return this.beginn;
   }

   public void setBeginn(Date beginn)
   {
      this.beginn = beginn;
   }

   public Date getEnde()
   {
      return this.ende;
   }

   public void setEnde(Date ende)
   {
      this.ende = ende;
   }

   public double getWoechentlicheStunden()
   {
      return this.woechentlicheStunden;
   }

   public void setWoechentlicheStunden(double woechentlicheStunden)
   {
      this.woechentlicheStunden = woechentlicheStunden;
   }

}