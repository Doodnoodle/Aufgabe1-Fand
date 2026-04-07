public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    // Aufgabe 2
    public void frageStellen(Dozent dozent, String frage) {
        System.out.println(name + " fragt: " + frage);
        dozent.frageBeantworten(this, frage);
    }

    // Aufgabe 3
    public void sprechstundenAnfrageSenden(Dozent dozent, String termin) {
        System.out.println(name + " möchte eine Sprechstunde am: " + termin);
        dozent.empfangeSprechstundenAnfrage(this, termin);
    }

    public void feedbackGeben(Dozent dozent, String feedback) {
        dozent.erhalteFeedback(this, feedback);
    }
}