/**
 * Westmont College Spring 2024
 * CS 030 Lab 06
 *
 * @author Dr. John Dalbey jdalbey@calpoly.edu
 * @author Kari Haworth kari.haworth@cfa.harvard.edu
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author Boaty McBoatface bmcboatface@westmont.edu TODO: replace this with your info.
 */

public class RecursionPractice {
  /**
   * Returns sum of the integers in the given array.
   *
   * @param items Int array to get sum of all items from.
   * @param index Index to stop computing the sum at.
   * @return Sum of the of integers in the array.
   */
  public static int arrayTotal(int[] items, int index) {
    return 0;
  }

  /**
   * Returns the sum of the positive integers in an array.
   *
   * @param items Int array to get sum of positive numbers from.
   * @param index Index to stop computing the sum at.
   * @return Sum of the positive integers in the array.
   */
  public static int arrayPosTotal(int[] items, int index) {
    return 0;
  }

  /**
   * Given a sentence, count the number of blank spaces.
   *
   * @param sentence String to count spaces from.
   * @return Number of spaces counted.
   */
  public static int countSpaces(String sentence) {
   return 0;
  }

  /**
   * Find the largest integer in the given array.
   *
   * @param items Array of integer to search max value from.
   * @param index Index to stop the search at.
   * @return Value of the maximum integer stored in array.
   */
  public static int findMax(int[] items, int index) {
    return 0;
  }

  /**
   * Determine whether a given String is a palindrome
   * (something that reads the same backward as it does forward).
   *
   * @param sentence Sentence to test the palindrome with.
   * @return True if palindrome, false otherwise.
   */
  public static boolean isPalindrome(String sentence) {
    return false;
  }

  /**
   * Instructor test; DO NOT MODIFY THIS METHOD!
   */
  public static void main() {
    // array to test with
    int[] intPosArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] intMixArr = {0, 1, 2, -3, -4, -5, -6, -7, 8, 9};

    // strings to test with
    String empty = "";
    String five = "This sentence should have five spaces.";
    String six = "      ";
    String fox = "Dog goes woof, cat goes meow, bird goes tweet " +
        "and mouse goes squeak; cow goes moo, frog goes " +
        "croak, and the elephant goes toot; ducks say " +
        "quack and fish goes blub, and the seal goes ow " +
        "ow ow; but there's one sound that no one knows " +
        "... WHAT DOES THE FOX SAY?";

    // palindromes to test with
    String palindrome1 = "ablewasiereisawelba";
    String palindrome2 = "amanaplanacanalpanama";

    // more arrays to test with
    int[] intArr1 = {10, 100, 1, 2, 0, -3, 123, 33, 1, -456, -23123};
    int[] intArr2 = {999999, 100, 1, 2, 0, -3, 123, 33, 1, -456, -233};
    int[] zeroArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    // arrayTotal test
    System.out.println("ArrayTotal (45): " + arrayTotal(intPosArr, 9));
    System.out.println("ArrayTotal (-5): " + arrayTotal(intMixArr, 9));
    System.out.println("ArrayTotal (0): " + arrayTotal(zeroArr, 9));
    System.out.println("ArrayTotal (113): " + arrayTotal(intArr1, 3));
    System.out.println("ArrayTotal (1000102): " + arrayTotal(intArr2, 3));
    System.out.println();

    // arrayPosTotal test
    System.out.println("ArrayPosTotal (45): " + arrayPosTotal(intPosArr, 9));
    System.out.println("ArrayPosTotal (20): " + arrayPosTotal(intMixArr, 9));
    System.out.println("ArrayPosTotal (0): " + arrayPosTotal(zeroArr, 9));
    System.out.println("ArrayPosTotal (270): " + arrayPosTotal(intArr1, 9));
    System.out.println("ArrayPosTotal (1000259): " + arrayPosTotal(intArr2, 9));
    System.out.println();

    // countSpaces test
    System.out.println("CountSpaces (0): " + countSpaces(empty));
    System.out.println("CountSpaces (0): " + countSpaces(palindrome1));
    System.out.println("CountSpaces (0): " + countSpaces(palindrome2));
    System.out.println("CountSpaces (5): " + countSpaces(five));
    System.out.println("CountSpaces (6): " + countSpaces(six));
    System.out.println("CountSpaces (51): " + countSpaces(fox));
    System.out.println();

    // findMax test
    System.out.println("FindMax (0): " + findMax(zeroArr, 9));
    System.out.println("FindMax (9): " + findMax(intPosArr, 9));
    System.out.println("FindMax (9): " + findMax(intMixArr, 9));
    System.out.println("FindMax (123): " + findMax(intArr1, 10));
    System.out.println("FindMax (999999): " + findMax(intArr2, 10));
    System.out.println();

    // isPalindrome test
    System.out.println("IsPalindrome 1 (T): " + isPalindrome(palindrome1));
    System.out.println("IsPalindrome 2 (T): " + isPalindrome(palindrome2));
    System.out.println("IsPalindrome 3 (T): " + isPalindrome(empty));
    System.out.println("IsPalindrome 4 (F): " + isPalindrome(fox));
    System.out.println("IsPalindrome 5 (T): " +
        isPalindrome("Never odd or even."));
    System.out.println("IsPalindrome 6 (T): " +
        isPalindrome("Never odd or eve'n."));
    System.out.println("IsPalindrome 7 (T): " +
        isPalindrome("!!NeveR o??DD; oR even.!"));
    System.out.println("IsPalindrome 8 (F): " +
        isPalindrome("This should not be true"));
    System.out.println("IsPalindrome 9 (T): " +
        isPalindrome("A man, a plan, a canal - Panama!\n"));
    System.out.println("IsPalindrome 10 (T): " +
        isPalindrome("\t\t123@#$(*&*()*321"));

  }
}