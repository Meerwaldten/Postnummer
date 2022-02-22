import java.util.ArrayList;

public class Main {

    static ArrayList<Postinfo> listen = Filereader.readFile();

    public static void main(String[] args) {

        System.out.println(skafByNavn(2650));
        System.out.println(skafByNavn(100000));
        System.out.println(skafByNavn(8000));
        System.out.println(skafByNavn(800));

        /*
        for (Postinfo p: listen) {
            System.out.println(p);
        }
         */

    }


    static String skafByNavn(int postnummer){
        String bynavn = "By ikke fundet";
        for (Postinfo p: listen) {
            if(postnummer==p.getPostNummer()){
                bynavn = p.getByNavn();
            }
        }
        return bynavn;
    }
}


