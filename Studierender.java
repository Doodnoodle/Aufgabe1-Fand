public class Studierender {
    public static void main(String[] args) throws Exception {}
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void frageStellen(String frage, Dozent dozent) {
        System.out.println(name + " stellt die Frage: " + frage);
    }

}