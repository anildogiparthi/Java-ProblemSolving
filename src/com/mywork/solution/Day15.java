package com.mywork.solution;

import java.util.HashMap;
import java.util.Map;

public class Day15 {

    private final String input = "0,14,6,20,1,4";

    public int run1(int limit) {
        int turnCount = 0;

        Map<Integer, Pair<Integer, Integer>> turnMapping = new HashMap<>();
        Map<Integer, Integer> numFrequency = new HashMap<>();

        String[] startNums = input.split(",");
        for(int i = 0; i < startNums.length; i++) {
            turnCount++;
            turnMapping.put(Integer.parseInt(startNums[i]), new Pair<>(turnCount, turnCount));
            numFrequency.put(Integer.parseInt(startNums[i]), 1);
        }

        int lastSpokenNum = Integer.parseInt(startNums[startNums.length - 1]);

        for(int i = 0; i < limit - startNums.length; i++) {
            if(numFrequency.get(lastSpokenNum) == 1) {
                lastSpokenNum = 0;
            } else {
                lastSpokenNum = turnMapping.get(lastSpokenNum).k() - turnMapping.get(lastSpokenNum).v();
            }

            numFrequency.putIfAbsent(lastSpokenNum, 0);
            numFrequency.put(lastSpokenNum, numFrequency.get(lastSpokenNum) + 1);
            turnCount++;
            turnMapping.putIfAbsent(lastSpokenNum, new Pair<>(turnCount, turnCount));
            turnMapping.put(lastSpokenNum, new Pair<>(turnCount, turnMapping.get(lastSpokenNum).k()));
        }

        return lastSpokenNum;
    }

    public int run2() {
        return run1(30000000);
    }

    public static void main(String[] args) {
        Day15 test = new Day15();
        System.out.println(test.run2());
    }

}

class Pair<K, V> {
    private K k;
    private V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K k() {
        return k;
    }

    public V v() {
        return v;
    }
}