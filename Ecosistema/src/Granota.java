public class Granota extends Animal{
    int edat;
    String tipus;

    public Granota(int edat, String tipus) {
        this.edat = edat;
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    @Override
    public String toString() {
        return "Granota{" +
                "edat=" + edat +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
