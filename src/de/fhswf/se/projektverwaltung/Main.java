package de.fhswf.se.projektverwaltung;

public class Main
{

   public static void main(String[] args)
   {
      System.out.println("Studenten werden erstellt.");
      Student student1 = new Student("student1@fh-swf.de");
      System.out.println(student1.toString());
      Student student2 = new Student("student2@fh-swf.de");
      System.out.println(student2.toString());
      System.out.println("\n");

      System.out.println("Organisation wird erstellt.");
      Organisation organisation1 = new Organisation("Organisation1");
      System.out.println(organisation1.toString());
      System.out.println("\n");

      System.out.println("Ansprechpartner werden erstellt.");
      Ansprechpartner ansprechpartner1 = new Ansprechpartner("Ansprechpartner1@gmx.de",
            "Organisation1");
      System.out.println(ansprechpartner1.toString());
      Ansprechpartner ansprechpartner2 = new Ansprechpartner("Ansprechpartner2@gmx.de",
            "Organisation1");
      System.out.println(ansprechpartner2.toString());
      Ansprechpartner ansprechpartner3 = new Ansprechpartner("Ansprechpartner3@gmx.de",
            "Organisation1");
      System.out.println(ansprechpartner3.toString());
      System.out.println("\n");

      System.out.println("Ansprechpartner werden der Organisation hinzugefuegt.");
      organisation1.addAnsprechpartner(ansprechpartner1);
      organisation1.addAnsprechpartner(ansprechpartner2);
      organisation1.addAnsprechpartner(ansprechpartner3);
      System.out.println(organisation1.toString());
      System.out.println("\n");

      System.out.println("Projekt wird erstellt.");
      Projekt projekt1 = new Projekt("Titel1");
      System.out.println(projekt1.toString());
      System.out.println("\n");
      System.out.println("Daten werden hinzugefuegt.");
      projekt1.setDozentEmail("dozent1@fh-swf.de");
      projekt1.setTeilnehmer(new Student[] { student1, student2 });
      projekt1.setKurzeBeschreibung("Kurze BEschreibung ist hier.");
      projekt1.setKurzeSkizze("Kurze Skizze ist hier.");
      projekt1.setGenauereBeschreibung("Genauere Beschreibung ist hier.");
      projekt1.setLehrveranstaltung("SE");
      projekt1.setProjektStatus("Ergaenzung notwendig");
      projekt1.setKommentar("An der Beschreibung muss was geaendert werden.");
      projekt1.setGenauereBeschreibung("verbesserte genauere Beschreibung ist hier.");
      projekt1.setProjektStatus("angenommen");
      projekt1.setTermin1("12.12.2021");
      projekt1.setTermin2("1.1.2022");
      projekt1.setAnsprechpartner(ansprechpartner1);
      System.out.println(projekt1.toString());

   }

}
