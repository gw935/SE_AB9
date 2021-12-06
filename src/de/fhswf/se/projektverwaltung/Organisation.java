package de.fhswf.se.projektverwaltung;

import java.util.ArrayList;

public class Organisation
{

   /**
    * Name der Organisation
    */
   private String name;

   /**
    * Ansprechpartner einer Organisation
    */
   private ArrayList ansprechpartner;

   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public ArrayList getAnsprechpartner()
   {
      return this.ansprechpartner;
   }

   public void setAnsprechpartner(ArrayList ansprechpartner)
   {
      this.ansprechpartner = ansprechpartner;
   }

}