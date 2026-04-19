import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy (String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public String getNazwaProjektu() {
        return nazwaProjektu;
    }

    public ArrayList<Pracownik> getPracownicy() {
        return this.pracownicy;
    }

    public void dodajPracownika(Pracownik pracownik) {
        getPracownicy().add(pracownik);
    }

    public void wypiszSkladZespolu() {
        System.out.println("--------Skład zespołu: " + this.nazwaProjektu + "--------");
        for (Pracownik pracownik : getPracownicy() ) {
            System.out.println(pracownik.przedstawSie());
        }
    }

    public double policzLacznyKoszt() {
        double tempLacznyKoszt = 0;

        for (Pracownik pracownik : getPracownicy()) {
            tempLacznyKoszt += pracownik.obliczKosztMiesieczny();
        }
        return tempLacznyKoszt;
    }

    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik pracownik : getPracownicy()) {
            if (pracownik.pobierzIdPracownika().equals(idPracownika)) {
               return pracownik;
            }
        }
        return null;
    }

    public void wypiszProgramistow() {
        System.out.println("--------Lista programistów--------" );
        for (Pracownik pracownik : getPracownicy()) {
            if (pracownik instanceof Programista) {
                System.out.println(pracownik.przedstawSie());
            }
        }
    }


}
