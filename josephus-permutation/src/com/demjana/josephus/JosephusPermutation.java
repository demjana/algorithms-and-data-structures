package com.demjana.josephus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JosephusPermutation {
  public static void main(String[] args) {
    System.out.println(josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 110));
    System.out.println(josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2));
    System.out.println(josephusPermutation(Arrays.asList("C", "o", "d", "e", "W", "a", "r", "s"), 4));
    System.out.println(josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3));
    System.out.println(josephusPermutation(Collections.emptyList(), 3));
  }

  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
    List<T> inputList = new ArrayList<>(items);
    List<T> result = new ArrayList<>();
    int index = 0;
    while (inputList.size() > 0) {
      index = (index + k - 1) % inputList.size();
      result.add((inputList.get(index)));
      inputList.remove(index);
    }
    return result;
  }
}
