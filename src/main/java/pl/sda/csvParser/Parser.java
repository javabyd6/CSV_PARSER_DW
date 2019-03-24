package pl.sda.csvParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Parser {

    private Path file = Paths.get ("HouseList.csv");

    public List<RealEstate> readfile() throws IOException {
        byte[] data = Files.readAllBytes (file);
        String convertData = new String (data);

        String[] dataArray = convertData.split ("\\r");
        //System.out.println (convertData.toString ());
        /*for (byte d: data) {
            System.out.println (d);
        }*/

        RealEstate[] realEstatesArray = new RealEstate[dataArray.length - 1];

        for (int i = 1; i < dataArray.length; i++) {

            String[] strings = dataArray[i].split (",");

            RealEstate realEstate = new RealEstate (strings[0], strings[1], Integer.valueOf (strings[2]), strings[3], Integer.valueOf (strings[4]), Integer.valueOf (strings[5]),
                    Integer.valueOf (strings[6]), strings[7], strings[8], Integer.valueOf (strings[9]), Double.valueOf (strings[10]), Double.valueOf (strings[11]));

            realEstatesArray[i - 1] = realEstate;
        }

        List<RealEstate> realEstatesList = Arrays.asList (realEstatesArray);
        return realEstatesList;
    }


    public void grupByCity(List<RealEstate> realEstates) {
        // Map<String,List<RealEstate>>
        // klucz to miast, a lista wartości to nie ruchomości

        Map<String, List<RealEstate>> map = new HashMap<> ();
        // iterować po realestates
        //klucz miasto
        // sprawdzam czy klucz z iteracji jest na mapie

        for (RealEstate e : realEstates) {

            if (map.get (e.getCity ()) == null) {
                List<RealEstate> list = new ArrayList<> ();
                list.add (e);
                map.put (e.getCity (), list);
            } else {
                List<RealEstate> lista = map.get (e.getCity ());
                lista.add (e);
                map.put (e.getCity (), lista);

            }

        }

        final Set<String> stringSet = map.keySet ();

        for (String e: stringSet) {
            System.out.println (map.get (e));
        }


    }
}
