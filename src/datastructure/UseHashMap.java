package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("first name", "John");
        personalInfo.put("last name", "doe");
        personalInfo.put("cellphone", "3472516194");
        personalInfo.put("email address", "Jassiharsh@gmail.com");

        System.out.println(personalInfo.get("cellphone"));
        for(Map.Entry entry: personalInfo.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        List<String> citiesOfUSA = new ArrayList<>();
        citiesOfUSA.add("NYC");
        citiesOfUSA.add("LA");
        citiesOfUSA.add("Miami");
        List<String> citiesOfCanada = new ArrayList<>();
        citiesOfCanada.add("toronto");
        citiesOfCanada.add("montreal");
        citiesOfCanada.add("ottawa");
        List<String> citiesOfEngland = new ArrayList<>();
        citiesOfEngland.add("London");
        citiesOfEngland.add("manchester");
        citiesOfEngland.add("leeds");

        Map<String, List<String>> map = new HashMap<>();
        map.put("USA:", citiesOfUSA);
        map.put("Canada:", citiesOfCanada);
        map.put("England:", citiesOfEngland);

        System.out.println(map.get("USA"));
        for(Map.Entry entry: map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
