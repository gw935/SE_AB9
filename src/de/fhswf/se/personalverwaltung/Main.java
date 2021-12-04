package de.fhswf.se.personalverwaltung;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Main main = new Main();
      main.control();
   }

   private List<Mitarbeiter> mitarbeiter;

   private boolean isRunning = false;

   private Scanner scanner;

   public Main()
   {
      mitarbeiter = new ArrayList<Mitarbeiter>();
      scanner = new Scanner(System.in);

      isRunning = true;
   }

   public void control()
   {
      while (isRunning)
      {
         System.out.println(
               "Was wollen Sie tun? \nGeben Sie \"erstellen\", \"einsehen\" oder \"beenden\" ein.");
         String aktion = scanner.nextLine();
         System.out.println(aktion);
         switch (aktion)
         {
            case "erstellen":
               erstelleMitarbeiter();
               break;
            case "einsehen":
               System.out.println("Anzeigen aller Mitarbeiter:");
               for (Mitarbeiter m : mitarbeiter)
               {
                  System.out.println(m.toString());
               }
               break;
            case "beenden":
               System.out.println("Das Program wird beendet.");
               isRunning = false;
               break;

            default:
               System.out.println("Unbekannte Eingabe. Versuchen Sie es erneut.");
               break;
         }
      }
   }

   private void erstelleMitarbeiter()
   {
      boolean falscheEingabe = false;
      while (!falscheEingabe)
      {
         System.out.println("Was soll erstellt werden? \n\"angestellter\" oder \"hilfskraft\"?");
         String aktion = scanner.nextLine();
         if (aktion.equals("angestellter"))
         {
            boolean falschesDatum = false;
            String vorname;
            String nachname;
            String plz;
            String ort;
            String strasse;
            String eintritsdatum;
            System.out.println("Bitte geben Sie die Folgenden Daten ein:");
            System.out.println("Vorname: ");
            vorname = scanner.nextLine();
            System.out.println("Nachname: ");
            nachname = scanner.nextLine();
            System.out.println("PLZ: ");
            plz = scanner.nextLine();
            System.out.println("Ort: ");
            ort = scanner.nextLine();
            System.out.println("Strasse: ");
            strasse = scanner.nextLine();
            System.out.println("Eintritsdatum: ");
            eintritsdatum = scanner.nextLine();

            mitarbeiter.add(new Angestellte(vorname, nachname, plz, ort, strasse, eintritsdatum));
            System.out.println("Angestellter wurde erstellt.");

            falscheEingabe = true;
         }
         else if (aktion.equals("hilfskraft"))
         {
            String vorname;
            String nachname;
            String plz;
            String ort;
            String strasse;
            String matrNr;

            System.out.println("Bitte geben Sie die Folgenden Daten ein:");
            System.out.println("Vorname: ");
            vorname = scanner.nextLine();
            System.out.println("Nachname: ");
            nachname = scanner.nextLine();
            System.out.println("PLZ: ");
            plz = scanner.nextLine();
            System.out.println("Ort: ");
            ort = scanner.nextLine();
            System.out.println("Strasse: ");
            strasse = scanner.nextLine();
            System.out.println("Matrikelnummer: ");
            matrNr = scanner.nextLine();

            Hilfskraft hilfskraft = new Hilfskraft(vorname, nachname, plz, ort, strasse, matrNr);

            boolean mehrVertraege = true;
            while (mehrVertraege)
            {
               System.out.println("Es wird ein neuer Arbeitsvertrag angelegt.");
               String beginn = null;
               String ende = null;
               double woechentlicheStunden = 0;
               System.out.println("Beginn des Arbeitsvertrags: ");
               beginn = scanner.nextLine();
               System.out.println("Ende des Arbeitsvertrags: ");
               ende = scanner.nextLine();
               System.out.println("woechentliche Stunden: ");
               try
               {
                  woechentlicheStunden = Double.valueOf(scanner.nextLine());

               }
               catch (NumberFormatException e)
               {
                  System.out.println("Falsche eingabe. Woechentliche Stunden sind 0.");
               }

               hilfskraft.addArbeitsvertrag(new Arbeitsvertrag(beginn, ende, woechentlicheStunden));

               System.out.println("Wollen Sie einen weiteren Arbeitsvertrag erstellen?");
               System.out.println("j fuer Ja und alles andere fuer nein");
               if (scanner.nextLine().equals("j"))
               {
                  mehrVertraege = true;
               }
               else
               {
                  mehrVertraege = false;
               }
            }
            mitarbeiter.add(hilfskraft);
            System.out.println("Angestellter wurde erstellt.");

            falscheEingabe = true;
         }
      }
   }
}
