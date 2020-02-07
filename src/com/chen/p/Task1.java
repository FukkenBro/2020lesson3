package com.chen.p;

//Дз3
//        1. Написать метод numJewelsInStones который принимает 2 параметра:
//        - String jewels: строка, каждый символ который символизирует драгоценный камень, символы уникальны
//        - String stones: строка, каждый символ который символизирует камень.
//
//        Строки могут состоять только из символов a..zA..Z
//        Метод должне вернуть количество другоценных камней в строке stones.
//
//        Пример:
//        jewels = "aAb"
//        stones = "caсAcA"
//        Output: 3
//
//        Explanation: в строке stones есть 3 драг. камня: a,A,A


import java.util.HashSet;
import java.util.Iterator;

public class Task1 {

    public static void main(String[] args) throws Exception {
        String stones = "sadasdASdasdasdUASDkRRRRRJASDGBJHasdkajsdaksdgbasjkdaslkdhajsdahlskdgkGHKJDAS";
        String jewels = "ASdQerSARRRRR";
        System.out.println("Jewels:" + jewels);
        System.out.println("Stones:" + stones);
        System.out.println(numJewelsInStones(jewels, stones));
    }

    static int numJewelsInStones(String jewels, String stones) throws Exception {
        validate(jewels);
        validate(stones);
        jewels = checklIfUniqe(jewels);
        int jewelCount = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    jewelCount++;
                }
            }
        }
        return jewelCount;
    }

    static String validate(String input) throws Exception {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                sb.append(input.charAt(i));
            } else {
                throw new Exception("Input must contain A-Z or a-z characters only");
            }
        }
        return sb.toString();
    }

    static String checklIfUniqe(String input) {
        StringBuilder sb = new StringBuilder("");
        HashSet<Character> uniqeChars = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            uniqeChars.add(input.charAt(i));
        }
        Iterator character = uniqeChars.iterator();
        while (character.hasNext()) {
            sb.append(character.next());
        }
        return sb.toString();
    }
}

