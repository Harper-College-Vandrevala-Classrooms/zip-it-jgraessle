package com.csc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zipper <T, Y>{
    List<T> combinedList = new ArrayList<>();
    public List<T> Zip(List<T> list1, List<T> list2) {
        
        for (int i = 0; i < list1.size() + list2.size(); i++) {

            if (i < list1.size()) {
                combinedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                combinedList.add(list2.get(i));
            }
        }
        return combinedList;
    }
    public HashMap <T, Y> hashmapify(List<T> list1, List<Y> list2) {
        HashMap <T, Y> map = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i), list2.get(i));
        }
        return map;
    }

public static void main(String args[]) {
    List<String> stringList = List.of("one", "two", "three");
    List<String> stringList2 = List.of("four", "five", "six", "seven");
    List<Integer> intList =  List.of(1, 2, 3);
    List<Integer> intList2 =  List.of(4, 5, 6, 7);
    List<Double> doubleList = List.of(1.0, 2.0, 3.0);
    List<Double> doubleList2 = List.of(4.0, 5.0, 6.0, 7.0);

    Zipper<String, String> zipString = new Zipper<>();
    System.out.println(zipString.Zip(stringList, stringList2));
    Zipper<Integer, Integer> zipInteger = new Zipper<>();
    System.out.println(zipInteger.Zip(intList, intList2));
    Zipper<Double, Double> zipDouble = new Zipper<>();
    System.out.println(zipDouble.Zip(doubleList, doubleList2));

    Zipper<String, Integer> zipStrinteger = new Zipper<>();
    List<String> colors = List.of("White", "Black", "Orange", "Pink");
    List<Integer> nums = List.of(1, 3, 5, 7);
    HashMap<String, Integer> map = zipStrinteger.hashmapify(colors, nums);
    System.out.println(map);
}
}
