public class Dozent {
    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozent(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public String getName() {
        return name;
    }

    public void frageBeantworten(Studierender student, String frage) {
        System.out.println(name + " beantwortet die Frage von "
                + student.getName() + ": Antwort auf '" + frage + "'");
    }

    public void empfangeSprechstundenAnfrage(Studierender student, String termin) {
        System.out.println(name + " hat eine Sprechstundenanfrage von "
                + student.getName() + " für den Termin: " + termin);
    }

    public void erhalteFeedback(Studierender student, String feedback) {
        System.out.println(name + " erhält Feedback von "
                + student.getName() + ": " + feedback);
    }
}