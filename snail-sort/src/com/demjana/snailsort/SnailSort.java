package com.demjana.snailsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnailSort {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(snail(new int[][] {
        {1, 2, 3},
        {8, 9, 4},
        {7, 6, 5}})));
    System.out.println();

    System.out.println(Arrays.toString(snail(new int[][] {
        {1, 2, 3, 4},
        {12, 13, 14, 5},
        {11, 16, 15, 6},
        {10, 9, 8, 7}})));
    System.out.println();

    System.out.println(Arrays.toString(snail(new int[][] {
        {1, 2},
        {4, 3}})));
    System.out.println();

    System.out.println(Arrays.toString(snail(new int[][] {
        {1, 2, 3, 4, 5, 6},
        {20, 21, 22, 23, 24, 7},
        {19, 32, 33, 34, 25, 8},
        {18, 31, 36, 35, 26, 9},
        {17, 30, 29, 28, 27, 10},
        {16, 15, 14, 13, 12, 11}})));
  }

  public static int[] snail(int[][] array) {
    if (array[0].length <= 0) {
      return new int[0];
    }

    List<Integer> output = new ArrayList<>();
    int outputSize = array.length * array.length;
    int xIndex = 0;
    int yIndex = 0;
    int xMax = array.length;
    int yMax = array.length;

    while (outputSize != 0) {

      for (int i = xIndex; i < xMax; i++) {
        output.add(array[xIndex][i]);
      }

      for (int i = yIndex + 1; i < yMax; i++) {
        output.add(array[i][yMax - 1]);
      }

      for (int i = xMax - 2; i >= xIndex; i--) {
        output.add(array[xMax - 1][i]);
      }

      for (int i = yMax - 2; i > yIndex; i--) {
        output.add(array[i][yIndex]);
      }

      xIndex++;
      xMax--;
      yIndex++;
      yMax--;
      outputSize--;
    }

    return output.stream().mapToInt(Integer::intValue).toArray();
  }
}
