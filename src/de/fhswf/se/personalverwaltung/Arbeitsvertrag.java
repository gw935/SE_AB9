package de.fhswf.se.personalverwaltung;

public class Arbeitsvertrag
{

   private String beginn;

   private String ende;

   /**
    * Woechentliche Stunden einer Arbeitskraft
    */
   private double woechentlicheStunden;

   public Arbeitsvertrag(String beginn, String ende, double woechentlicheStunden)
   {
      this.beginn = beginn;
      this.ende = ende;
      this.woechentlicheStunden = woechentlicheStunden;
   }

   public String getBeginn()
   {
      return this.beginn;
   }

   public void setBeginn(String beginn)
   {
      this.beginn = beginn;
   }

   public String getEnde()
   {
      return this.ende;
   }

   public void setEnde(String ende)
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

   @Override
   public String toString()
   {
      return "Arbeitsvertrag:\nBeginn: " + getBeginn() + " Ende: " + getEnde()
            + " woechentliche Stunden: " + getWoechentlicheStunden() + "\n";
   }

}