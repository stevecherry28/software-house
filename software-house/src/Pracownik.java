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
                    "idPracownika='" + idPracownika + '\'' +
                    ", imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", stawkaBazowa=" + stawkaBazowa +
                    '}';
        }
    }


