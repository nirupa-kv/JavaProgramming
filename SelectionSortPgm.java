import java.util.*;
public class SelectionSortPgm {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int[] array;
      int n;
      System.out.println("Enter the number of elements in the array:");
      n=sc.nextInt();
      array=new int[n];
      System.out.println("Enter the array elements:");
      for(int i=0;i<n;i++) {
         System.out.print("Element "+(i+1)+" : ");
         array[i]=sc.nextInt();
         System.out.println();
      }
      System.out.println("Original Array:");
      for(int k=0;k<n;k++) {
         System.out.print(array[k]+"\t");
      }
      System.out.println();
      SelectionSort s=new SelectionSort();
      s.integerSelectionSort(array);
      System.out.println("Selection Sorting:");
      for(int k=0;k<n;k++) {
         System.out.print(array[k]+"\t");
      }
   }
}

import java.util.*;
public class SelectionSort {
   public static final String RESET = "\u001B[0m";
   public static final String RED = "\u001B[31m";
   public static final String GREEN = "\u001B[32m";
   public static final String BLUE = "\u001B[34m";
   public void integerSelectionSort(int[] array) {
      int swap=0;
      int min=0;
      int n=array.length;
      for(int i=0;i<n-1;i++) {
         min=i;
         for(int j=i+1;j<=n-1;j++) {
            if(array[min]>array[j])
               min=j;
         }
         swap=array[i];
         array[i]=array[min];
         array[min]=swap;
         System.out.println("Pass "+(i+1)+": ");
         for(int k=0;k<n;k++) {
            if(k<i) {
               System.out.print(GREEN+array[k]+RESET);
               System.out.print("\t");
            }
            else if(k==swap) {
               System.out.print(RED+array[k]+RESET);
               System.out.print("\t");
            }
            else if(k==i) {
               System.out.print(BLUE+array[k]+RESET);
               System.out.print("  |   ");
            }
            else {
               System.out.print(RED+array[k]+RESET);
               System.out.print("\t");
            }
         }
         System.out.println();
      }
      System.out.println();
   }
}