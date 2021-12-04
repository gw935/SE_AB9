package de.fhswf.se.personalverwaltung;

import java.sql.Date;

public class Angestellte extends Mitarbeiter
{

   /**
    * Eintrittsdatum eines Angestellten Date(int year, int month, int date)
    */
   private Date eintrittsdatum;

   public Date getEintrittsdatum()
   {
      return this.eintrittsdatum;
   }

   public void setEintrittsdatum(Date eintrittsdatum)
   {
      this.eintrittsdatum = eintrittsdatum;
   }

}