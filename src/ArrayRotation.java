import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * https://www.geeksforgeeks.org/array-rotation/
 */

public class ArrayRotation {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter no.of elements:");
    int n = scanner.nextInt();
    int[] ar = new int[n];
    for(int i = 0; i < n; i++) {
      ar[i] = scanner.nextInt();
    }
    ArrayRotation arrayRotation = new ArrayRotation();
    arrayRotation.display(ar);
    arrayRotation.rotate(ar,n,3,arrayRotation);
  }

  public void rotate(int[] ar, int index, int num, ArrayRotation arrayRotation) {

    int length = index;
    int pos = length - num;
      if(pos >= 0){


        for ( int i = pos; i < length; i++){
            int temp = ar[i];
            ar[i] = ar[i - pos];
            ar[i-pos] = temp;
        }
        arrayRotation.display(ar);
        rotate(ar, index-3,3, arrayRotation);
      }
  }

  public void display(int[] ar) {

    System.out.println("Array Elements: ");
    int length = ar.length;
    for(int i = 0; i < length; i++) {
      System.out.print(ar[i]+" ");
    }
    System.out.println("---------------");

  }
}
