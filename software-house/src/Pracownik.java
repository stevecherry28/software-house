import java.util.Objects;

public class Pracownik {
        private String idPracownika;
        private String imie;
        private String nazwisko;
        private double stawkaBazowa;

        public Pracownik (String idPracownika, String imie,
                          String nazwisko, double stawkaBazowa) {
            this.idPracownika = idPracownika;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.stawkaBazowa = stawkaBazowa;
        }


        public String getImie() {
            return this.imie;
        }

        public String getNazwisko() {
            return this.nazwisko;
        }

        public double getStawkaBazowa() {
            return this.stawkaBazowa;
        }

        public final String pobierzIdPracownika() {
            return this.idPracownika;
        }

        public double obliczKosztMiesieczny() {
            return this.stawkaBazowa;
        }

        public String przedstawSie() {
            return pobierzIdPracownika() + ", " + getImie() + ", " + getNazwisko();
        }

        @Override
        public String toString() {
            return "Pracownik{" +
                    "idPracownika='" + pobierzIdPracownika() + '\'' +
                    ", imie='" + getImie() + '\'' +
                    ", nazwisko='" + getNazwisko() + '\'' +
                    ", stawkaBazowa=" + getStawkaBazowa() +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPracownika);
    }
}


