package plant;



import java.util.*;

import static java.util.stream.Collectors.toList;

public class PlantMain {
    public static void main(String[] args) {
        "He".chars().forEach(System.out::print);
        System.out.println();
        "He".chars().forEach(x -> System.out.println((char) x));
        List<String> houseJohn = Arrays.asList("Tom","John");
        List<String> houseNathal = Arrays.asList("Peter","Jimmy");

       // for(ProcessPath.ProcessHandler ph:Iterator<ProcessHandler >)


        List<List<String>> cali = new ArrayList<>();
        cali.add(houseJohn);
        cali.add(houseNathal);
        List<String> houseName = new ArrayList<>();
        for(List<String> house: cali){
            for(String hn:house){
                houseName.add(hn);
            }

        }
        System.out.println("Using normal:");
        System.out.println(houseName);
        System.out.println();
        System.out.println("Using flat_map: ");
        List<String> flatMapList = cali.stream().flatMap(Collection::stream).collect(toList());
        System.out.println(flatMapList);
    }
}
