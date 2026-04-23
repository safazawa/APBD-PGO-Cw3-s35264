public class KlientKawiarni {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public int getIdKlienta() {
        return idKlienta;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public String getPelneDane() {
        return imie + " " + nazwisko + " (email: " + email + ")";
    }

    @Override
    public String toString() {
        return "KlientKawiarni: " + "idKlienta=" + idKlienta + ", imie='" + imie +'\'' + ", nazwisko='" + nazwisko + '\'' + ", email='" + email + '\'' + '.';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null) return false;
        if (!(obj instanceof KlientKawiarni)) return false;
        KlientKawiarni other = (KlientKawiarni) obj;
        return this.idKlienta == other.idKlienta || this.email.equals(other.email);

    }
}
