package de.fhswf.se.personalverwaltung;

import java.util.*;

public class Hilfskraft extends Mitarbeiter
{

   private ArrayList<Arbeitsvertrag> arbeitsvertraege;

   /**
    * Matrikelnummer einer Hilfskraft
    */
   private String matrNr;

   /**
    * Stundenlohn der Studentischen Hilfskr�fte
    */
   private double stundenlohn = 12;

   public Hilfskraft(String vorname, String nachname, String plz, String ort, String strasse,
         String matrNr)
   {
      setVorname(vorname);
      setNachname(nachname);
      setPlz(plz);
      setOrt(ort);
      setStrasse(strasse);
      setMatrNr(matrNr);
      arbeitsvertraege = new ArrayList<Arbeitsvertrag>();
   }

   public String getMatrNr()
   {
      return this.matrNr;
   }

   public void setMatrNr(String matrNr)
   {
      this.matrNr = matrNr;
   }

   public double getStundenlohn()
   {
      return this.stundenlohn;
   }

   public void setStundenlohn(double stundenlohn)
   {
      this.stundenlohn = stundenlohn;
   }

   public ArrayList<Arbeitsvertrag> getArbeitsvertraege()
   {
      return arbeitsvertraege;
   }

   public void setArbeitsvertraege(ArrayList<Arbeitsvertrag> arbeitsvertraege)
   {
      this.arbeitsvertraege = arbeitsvertraege;
   }

   public void addArbeitsvertrag(Arbeitsvertrag arberitsvertrag)
   {
      arbeitsvertraege.add(arberitsvertrag);
   }

   private String zusammenfassungArbeitsvertraege()
   {
      String temp = "";
      for (Arbeitsvertrag arbeitsvertrag : arbeitsvertraege)
      {
         temp += arbeitsvertrag.toString();
      }

      return temp;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "Hilfskraft, " + getMatrNr() + ", " + getVorname() + ", " + getNachname() + ", "
            + getPlz() + ", " + getOrt() + ", " + getStrasse() + ", " + getStundenlohn() + "€\n"
            + zusammenfassungArbeitsvertraege();
   }

}