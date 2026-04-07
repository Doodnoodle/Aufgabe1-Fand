public class Dozent {
    private String name;
    private String fakultaet;
    private int bueroNummer;

    public Dozent(String name, String fakultaet, int bueroNummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueroNummer = bueroNummer;
 
    }
    public String getName() {
        return name;
    }
    public String getFakultaet() {
        return fakultaet;
    }
    public int getBueroNummer() {
        return bueroNummer;
    }

    public String frageBeantworten(String frage, Studierender studierender) {
        if (frage.equalsIgnoreCase("Wie heißt der Dozent?")) {
            return studierender.getName() + ", der Dozent heißt " + name + ".";
        } else if (frage.equalsIgnoreCase("Welche Fakultät gehört der Dozent an?")) {
            return studierender.getName() + ", der Dozent gehört zur Fakultät " + fakultaet + ".";
        } else if (frage.equalsIgnoreCase("Wie lautet die Bürosnummer des Dozenten?")) {
            return studierender.getName() + ", die Bürosnummer des Dozenten ist " + bueroNummer + ".";
        } else {
            return "Tut mir leid, " + studierender.getName() + ", diese Frage kann ich nicht beantworten.";
        }
    }
}