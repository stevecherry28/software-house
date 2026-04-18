public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista (String idPracownika, String imie,
                       String nazwisko, double stawkaBazowa,
                        String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String getGlownyJezyk() {
        return glownyJezyk;
    }

    public int getLiczbaRepozytoriow() {
        return liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny() + 4000;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + ", PROGRAMISTA";
    }

    public void wypiszTechnologie() {
        System.out.println("Główny język: " + '\'' + getGlownyJezyk() + '\''
                + "\nInne języki: 'Python', 'SQL'");
    }

    @Override
    public String toString() {
        return "Programista{" +
                "idPracownika='" + pobierzIdPracownika() + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", stawkaBazowa=" + getStawkaBazowa() +
                ", glownyJezyk= '" + getGlownyJezyk() + '\'' +
                ", liczbaRepozytoriow=" + getLiczbaRepozytoriow() +
                '}';
    }
}
