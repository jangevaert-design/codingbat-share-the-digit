package edu.cnm.deepdive;

/*

Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
such as the 2 in 12 and 23.

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */

public class CodingBatShareTheDigit {

  public static void main(String[] args) {
    System.out.printf("with the ints %d and %d, the outcome is " + shareDigit(12, 23) + ".\n", 12, 23);
    System.out.printf("with the ints %d and %d, the outcome is " + shareDigit(12, 43) + ".\n", 12, 43);
    System.out.printf("with the ints %d and %d, the outcome is " + shareDigit(12, 44) + ".\n", 12, 44);
  }

  public static boolean shareDigit(int a, int b) {
    return (a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || b / 10 == a % 5);

  }
}
