package de.fhswf.se.personalverwaltung;

public class Angestellte extends Mitarbeiter
{
   private String eintrittsdatum;

   public Angestellte(String vorname, String nachname, String plz, String ort, String strasse,
         String date)
   {
      setVorname(vorname);
      setNachname(nachname);
      setPlz(plz);
      setOrt(ort);
      setStrasse(strasse);
      setEintrittsdatum(date);
   }

   public String getEintrittsdatum()
   {
      return this.eintrittsdatum;
   }

   public void setEintrittsdatum(String eintrittsdatum)
   {
      this.eintrittsdatum = eintrittsdatum;
   }

   @Override
   public String toString()
   {
      return "Angestellter, " + getVorname() + ", " + getNachname() + ", " + getPlz() + ", "
            + getOrt() + ", " + getStrasse() + ", " + getEintrittsdatum() + "\n";
   }

}