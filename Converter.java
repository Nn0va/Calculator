package CalculatorTest;

import java.util.TreeMap;

public class Converter {
    TreeMap<Character, Integer> novaKeyMap = new TreeMap<>();


    public Converter() {
        novaKeyMap.put('I', 1);
        novaKeyMap.put('V', 5);
        novaKeyMap.put('X', 10);
        novaKeyMap.put('L', 50);
        novaKeyMap.put('C', 100);
        novaKeyMap.put('D', 500);
        novaKeyMap.put('M', 1000);




    }

    public boolean isNova(String number){
        //"V"->'V'
        return novaKeyMap.containsKey(number.charAt(0));
    }



}