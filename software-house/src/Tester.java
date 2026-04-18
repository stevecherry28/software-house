public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester (String idPracownika, String imie,
                   String nazwisko, double stawkaBazowa,
                   boolean czyAutomatyzujacy,  int liczbaScenariuszy) {
        super(idPracownika, imie,
                nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean getCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        if (czyAutomatyzujacy) {
            return super.obliczKosztMiesieczny() + 3000;
        }
        return super.obliczKosztMiesieczny();
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + ", TESTER";
    }

    public void uruchomRaportTestow() {
        if (czyAutomatyzujacy) {
            System.out.println("Tester zautomatyzował kod" +
                    "\nUwzględniono liczbę scenariuszy: " + getLiczbaScenariuszy());
        } else {
            System.out.println("Uwzględniono liczbę scenariuszy: " +
                    getLiczbaScenariuszy());
        }
    }

}
