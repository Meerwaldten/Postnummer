public class Postinfo {

    private int postNummer;
    private String byNavn;

    public Postinfo (int postNummer, String byNavn){
        this.postNummer = postNummer;
        this.byNavn = byNavn;
    }

    @Override
    public String toString() {
        return "Postinfo{" +
                "postNummer=" + postNummer +
                ", byNavn='" + byNavn + '\'' +
                '}';
    }

    public int getPostNummer() {
        return postNummer;
    }

    public void setPostNummer(int postNummer) {
        this.postNummer = postNummer;
    }

    public String getByNavn() {
        return byNavn;
    }

    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }
}
