package pl.sda.csvParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Parser parser = new Parser ();

        parser.grupByCity (parser.readfile ());


        //Przykład jak możemy rozwiązać to zadanie za pomocą streamów
        Map<String, List<RealEstate>> collect = parser.readfile ().stream ().collect (Collectors.groupingBy (RealEstate::getCity));
    }
}
