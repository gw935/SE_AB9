package de.fhswf.se.personalverwaltung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
   static final String DATABASE_URL = "jdbc:mysql://localhost/se9";

   public static void main(String[] args)
   {
      Main main = new Main();
      main.control();
   }

   private Connection connection;

   private Statement statement;

   private ResultSet resultset;

   private List<Angestellte> angestellte;

   private List<Hilfskraft> hilfskraefte;

   private boolean isRunning = false;

   private Scanner scanner;

   public Main()
   {
      connection = null;
      statement = null;
      resultset = null;

      angestellte = new ArrayList<Angestellte>();
      hilfskraefte = new ArrayList<Hilfskraft>();

      getDBData(connection, statement, resultset);

      scanner = new Scanner(System.in);

      isRunning = true;
   }

   private void getDBData(Connection connection, Statement statement, ResultSet resultset)
   {
      System.out.println("Lese Daten von der Datenbank.");
      try
      {
         connection = DriverManager.getConnection(DATABASE_URL, "root", "");
         statement = connection.createStatement();

         // Angestellte von der Datenbank holen und zu der Liste hinzufuegen
         resultset = statement.executeQuery("SELECT * FROM angestellte");
         while (resultset.next())
         {
            angestellte.add(
                  new Angestellte(resultset.getString("vorname"), resultset.getString("nachname"),
                        resultset.getString("plz"), resultset.getString("ort"),
                        resultset.getString("strasse"), resultset.getString("eintrittsdatum")));
         }

         // Hilfskraefte von der Datenbank holen und zu der Liste hinzufuegen
         resultset = statement.executeQuery("SELECT * FROM hilfskraefte");
         while (resultset.next())
         {
            hilfskraefte.add(
                  new Hilfskraft(resultset.getString("vorname"), resultset.getString("nachname"),
                        resultset.getString("plz"), resultset.getString("ort"),
                        resultset.getString("strasse"), resultset.getString("matrNr")));
         }
         // Arbeitsvertraege
         resultset = statement.executeQuery("SELECT * FROM arbeitsvertraege");
         while (resultset.next())
         {
            String matrNr = resultset.getString("matrNr");

            String beginn = resultset.getString("beginn");

            String ende = resultset.getString("ende");

            double woechentlicheStunden = resultset.getDouble("woechentlicheStunden");

            for (Hilfskraft h : hilfskraefte)
            {
               if (h.getMatrNr().equals(matrNr))
               {
                  h.addArbeitsvertrag(
                        new Arbeitsvertrag(matrNr, beginn, ende, woechentlicheStunden));
               }
            }
         }
      }
      catch (SQLException e)
      {
         e.printStackTrace();
         System.out.println("Probleme bei SQL.");
      }
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
               for (Angestellte a : angestellte)
               {
                  System.out.println(a.toString());
               }
               for (Hilfskraft h : hilfskraefte)
               {
                  System.out.println(h.toString());
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
      try
      {
         connection = DriverManager.getConnection(DATABASE_URL, "root", "");
         statement = connection.createStatement();
      }
      catch (SQLException e2)
      {
         e2.printStackTrace();
         System.out.println("Probleme bei SQL.");
      }
      while (!falscheEingabe)
      {
         System.out.println("Was soll erstellt werden? \n\"angestellte\" oder \"hilfskraft\"?");
         String aktion = scanner.nextLine();
         if (aktion.equals("angestellte"))
         {
            boolean falschesDatum = false;
            String vorname;
            String nachname;
            String plz;
            String ort;
            String strasse;
            String eintrittsdatum;
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
            eintrittsdatum = scanner.nextLine();

            angestellte.add(new Angestellte(vorname, nachname, plz, ort, strasse, eintrittsdatum));

            // Speichern des Angestellten in Datenbank
            try
            {
               statement.executeUpdate(
                     "INSERT INTO angestellte(vorname, nachname, plz, ort, strasse, eintrittsdatum) VALUES('"
                           + vorname + "','" + nachname + "','" + plz + "','" + ort + "','"
                           + strasse + "','" + eintrittsdatum + "');");
            }
            catch (SQLException e)
            {
               e.printStackTrace();
               System.out.println("Probleme beim eintragen in die Datenbank.");
            }

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
            // Speichern der Hilfskraft in Datenbank
            try
            {
               statement.executeUpdate(
                     "INSERT INTO hilfskraefte(vorname, nachname, plz, ort, strasse, matrNr) VALUES('"
                           + vorname + "','" + nachname + "','" + plz + "','" + ort + "','"
                           + strasse + "','" + matrNr + " ')");
            }
            catch (SQLException e1)
            {
               e1.printStackTrace();
               System.out.println("Probleme beim eintragen in die Datenbank.");
            }

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

               hilfskraft.addArbeitsvertrag(
                     new Arbeitsvertrag(matrNr, beginn, ende, woechentlicheStunden));
               // Speichern des Arbeitsvertrags in Datenbank
               try
               {
                  statement.executeUpdate(
                        "INSERT INTO arbeitsvertraege(matrNr, beginn, ende, woechentlicheStunden) VALUES('"
                              + matrNr + "','" + beginn + "','" + ende + "','"
                              + woechentlicheStunden + " ')");
               }
               catch (SQLException e1)
               {
                  e1.printStackTrace();
                  System.out.println("Probleme beim eintragen in die Datenbank.");
               }

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
            hilfskraefte.add(hilfskraft);
            System.out.println("Angestellter wurde erstellt.");

            falscheEingabe = true;
         }
      }
   }
}
