import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Filereader {


     static ArrayList<Postinfo> readFile(){
        ArrayList<Postinfo> newList = new ArrayList<>();
        File f = new File("C:\\Users\\mikke\\IdeaProjects\\Postnummer\\src\\Postnumre");
        try{
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] lineSplit = line.split(":");
                int postNummer = parseInt(lineSplit[0]);
                String bynavn = lineSplit[1];
                Postinfo current = new Postinfo(postNummer, bynavn);
                newList.add(current);
            }
        }catch(Exception e){
            System.out.println("Timmy er den yngste");
        }
        return newList;
    }


}
