public class Studierender {
    public static void main(String[] args) throws Exception {}
    private String name;
    private int matrikelnummer;

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

}