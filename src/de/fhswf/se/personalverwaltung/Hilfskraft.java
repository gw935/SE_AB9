package de.fhswf.se.personalverwaltung;

import java.util.*;

public class Hilfskraft extends Mitarbeiter
{

   ArrayList<Arbeitsvertrag> arbeitsvertrag;

   /**
    * Matrikelnummer einer Hilfskraft
    */
   private String matrNr;

   /**
    * Stundenlohn der Studentischen Hilfskr�fte
    */
   private double stundenlohn;

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

}