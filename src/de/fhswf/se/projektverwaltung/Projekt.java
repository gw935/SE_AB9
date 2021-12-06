package de.fhswf.se.projektverwaltung;

public class Projekt
{

   Ansprechpartner ansprechpartner;

   /**
    * Teilnehmende Studenten
    */
   private Student[] teilnehmer;

   /**
    * Email eines Dozenten
    */
   private String dozentEmail;

   /**
    * zugeh�rige Lehrveranstaltung
    */
   private String lehrveranstaltung;

   /**
    * Titel eines Projektes
    */
   private String projektTitel;

   /**
    * Kurze Skizze des Projektes
    */
   private String kurzeSkizze;

   /**
    * kurze Beschreibung des Projektes
    */
   private String kurzeBeschreibung;

   /**
    * genauere Beschreibung des Projektes
    */
   private String genauereBeschreibung;

   /**
    * erster Termin des Projektes
    */
   private String termin1;

   /**
    * zweiter Termin des Projektes
    */
   private String termin2;

   /**
    * Kommentar des Projektes
    */
   private String kommentar;

   /**
    * Projektstatus eines Projektes, 4 St�ck: ~ angenommen, abgelehnt,
    * Erg�nzung notwendig, Status offen
    */
   private String projektStatus;

   public Student[] getTeilnehmer()
   {
      return this.teilnehmer;
   }

   public void setTeilnehmer(Student[] teilnehmer)
   {
      this.teilnehmer = teilnehmer;
   }

   public String getDozentEmail()
   {
      return this.dozentEmail;
   }

   public void setDozentEmail(String dozentEmail)
   {
      this.dozentEmail = dozentEmail;
   }

   public String getLehrveranstaltung()
   {
      return this.lehrveranstaltung;
   }

   public void setLehrveranstaltung(String lehrveranstaltung)
   {
      this.lehrveranstaltung = lehrveranstaltung;
   }

   public String getProjektTitel()
   {
      return this.projektTitel;
   }

   public void setProjektTitel(String projektTitel)
   {
      this.projektTitel = projektTitel;
   }

   public String getKurzeSkizze()
   {
      return this.kurzeSkizze;
   }

   public void setKurzeSkizze(String kurzeSkizze)
   {
      this.kurzeSkizze = kurzeSkizze;
   }

   public String getKurzeBeschreibung()
   {
      return this.kurzeBeschreibung;
   }

   public void setKurzeBeschreibung(String kurzeBeschreibung)
   {
      this.kurzeBeschreibung = kurzeBeschreibung;
   }

   public String getGenauereBeschreibung()
   {
      return this.genauereBeschreibung;
   }

   public void setGenauereBeschreibung(String genauereBeschreibung)
   {
      this.genauereBeschreibung = genauereBeschreibung;
   }

   public String getTermin1()
   {
      return this.termin1;
   }

   public void setTermin1(String termin1)
   {
      this.termin1 = termin1;
   }

   public String getTermin2()
   {
      return this.termin2;
   }

   public void setTermin2(String termin2)
   {
      this.termin2 = termin2;
   }

   public String getKommentar()
   {
      return this.kommentar;
   }

   public void setKommentar(String kommentar)
   {
      this.kommentar = kommentar;
   }

   public String getProjektStatus()
   {
      return this.projektStatus;
   }

   public void setProjektStatus(String projektStatus)
   {
      this.projektStatus = projektStatus;
   }

}