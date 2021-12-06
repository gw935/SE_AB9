package de.fhswf.se.projektverwaltung.model;

public class Organisation
{

   /**
    * Name der Organisation
    */
   private String name;

   public Organisation(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   @Override
   public String toString()
   {
      return "Organisation [name=" + name + "]";
   }

}