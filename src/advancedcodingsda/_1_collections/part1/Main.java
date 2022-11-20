package advancedcodingsda._1_collections.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Ex1 - Create a method that takes a String list as a parameter, then returns the list sorted alphabetically
 * from Z to A
 */


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

    }

    public List<String> sortList(List<String> input) {

        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(input);
        sortedList.sort(new Comparator<String>)() {

            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return sortedList;
    }

        //System.out.println("Hello world!");

}