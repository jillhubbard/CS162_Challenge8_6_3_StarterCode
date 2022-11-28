import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    System.out.println("Selection Sorting ...");
    int[] arr1 = {3, 86, -20, 14, 40};
    System.out.println(Arrays.toString(arr1));
    SelectionSort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
    
    System.out.println("Insertion Sorting ...");
    int[] arr2 = {3, 86, -20, 14, 40};
    System.out.println(Arrays.toString(arr2));
    InsertionSort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}