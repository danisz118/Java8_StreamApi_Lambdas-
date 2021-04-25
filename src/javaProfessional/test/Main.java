package javaProfessional.test;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Phone> map = new HashMap<>();
        map.put(1, new Phone("a", 3000));
        map.put(2, new Phone("b", 2500));
        map.put(3, new Phone("g", 80010));
        map.put(4, new Phone("d", 80660));
        map.put(5, new Phone("e", 806600));

        List<Phone> list = new ArrayList<>(map.values());
      //  list.sort((Comparator.comparing(o -> o.model)));

        List<Integer> collect = Arrays.asList(10, 20, 30, 40,-40 , 40)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
//        for (Phone phone : list) {
//            System.out.println(phone);
//    }
//        list.stream()
//                .filter(phone -> phone.battery>=2000)
//                .sorted(Comparator.comparing(Phone::getModel))
//                .map(Phone::getModel)
//                .forEach(System.out::println);

                //.forEach(System.out::println);

//        int[] arr = {10, 1, 2, 3 , 60 , 12 ,25 };
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted=true;
//            for (int i = 1; i < arr.length; i++) {
//                if (arr[i - 1] > arr[i]) {
//                    int tmq = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = tmq;
//                isSorted=false;
//                }
//
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }





}



