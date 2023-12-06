package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Pedro");
        list.add("Lucas");
        list.add("Luciano");
        list.add("Tania");
        list.add("Mel");
        list.add("Ted");
        list.add(1,"Renata");

        System.out.println("Tamanho do arrayList: " + list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'L');
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------------------");
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("Index of Renata: " + list.indexOf("Renata"));
        System.out.println("------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
        System.out.println(name);


    }
}
