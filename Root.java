package programming;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.lang.classfile.instruction.LineNumber;
import java.lang.reflect.Array;
import java.util.*;

public class Root {
    void main() {
//    int[] list = new int[5];
//
//    list[0] = 2;
//    System.out.println(list.length);
//    System.out.println("Year\tDays");
//    System.out.println("------------");
//
//    for (int year = 2000; year <= 2026; year++) {
//        System.out.println(year + "\t" + PrintLeapYear(year));
//    }

        // reversing an array
//    int[] list = {1, 2, 3, 4, 5}; // output {5, 4, 3, 2, 1}
//
//    for(int i = 0, j = list.length - 1; i < j; i++, j--){
//        int temp = list[i];
//        list[i] = list[j];
//        list[j] = temp;
//
//       // System.out.println(temp);
//    }

        // Linear Search
//    int [] list = {1, 3, 5, 6, -3, 0, 52, 2};
//    int i = LinearSearch(list, 5);
//    int j = LinearSearch(list, 52);
//    System.out.println(i);
//    System.out.println(j);

        //Binary search
//    int [] list = { 59, 50, 7, 66, 79, 45, 70, 60, 10, 11, 2, 4, 69};
//    Arrays.sort(list);
//
//    int i = BinarySearch(list, 10);
//    System.out.println(i);
//    int size = 50000000;
//    int [] list = new int[size];
//
//    for(int i =0; i < list.length; i++){
//        list[i] = (int)(Math.random() * 100000);
//    }
//
//    list[list.length - 1] = 999999;
//
//    int key = 999999;
//    long startTime = System.currentTimeMillis();
//    int i = LinearSearch(list, key);
//    long endTime = System.currentTimeMillis();
//    long linearExecutionTime = endTime - startTime;
//    System.out.println(i);
//    System.out.println("Linear Search execution time: " + linearExecutionTime + " ms");
//
//    Arrays.sort(list);
//
//    startTime = System.currentTimeMillis();
//    int binaryResult = BinarySearch(list, key);
//    endTime = System.currentTimeMillis();
//    long binaryExecutionTime = endTime - startTime;
//
//    System.out.println(binaryResult);
//    System.out.println("Binary Search execution time: " + binaryExecutionTime + " ms");

//    int size = 50;
//    int[] list = new int[size];
//
//    int count = 0;
//    list[count] = 2;
//    count++;
//
//    int number = 3;
//
//    while(count < size){
//        boolean isPrime = true;
//        for(int i =0; i < count && list[i] <= Math.sqrt(number); i++){
//           if(number % list[i] == 0){
//               isPrime = false;
//               break;
//           }
//        }
//
//        if(isPrime){
//            list[count] = number;
//            count++;
//
//            if(count % 10 == 0){
//                System.out.print(number);
//            }else {
//                System.out.print(number + " ");
//            }
//
//        }
//
//        number += 2;
//    }

//    Scanner scanner = new Scanner(System.in);
//
//    int size = 10;
//    int[] lists = new int[size];
//
//    System.out.print("Enter 10 numbers: ");
//    for(int i =0; i < lists.length; i++){
//        lists[i] = scanner.nextInt();
//    }
//
//    int[] output = ReverseArray(lists);
//    System.out.println(Arrays.toString(output));

//   Scanner scanner = new Scanner(System.in);
//
//   int size;
//   System.out.print("Enter the number of values: ");
//   size = scanner.nextInt();
//
//    int[] lists = new int[size];
//
//   System.out.println("Enter the values: ");
//
//   for(int i=0; i < lists.length; i++){
//       lists[i] = scanner.nextInt();
//   }
//
//   if(consecutiveMatch(lists)){
//       System.out.println("The list has consecutive four numbers.");
//   }else{
//       System.out.println("The list has no consecutive four numbers.");
//   }
        Scanner scanner = new Scanner(System.in);

//        int size = 10;
//        int[] lists = new int[size];
//
//        System.out.print("Enter ten numbers: ");
//        for (int i = 0; i < lists.length; i++) {
//            lists[i] = scanner.nextInt();
//        }
//
//      int[] newArray =  eliminateDuplicates(lists);
//        // 3. Display the unique results cleanly
//        System.out.print("The distinct numbers are: ");
//      for(int i=0; i < newArray.length; i++){
//          System.out.println(newArray[i] + " ");
//      }
//      System.out.println();

//      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 4, 3, 6, 7, 8, 7, 9,9));
//
//        Collections.sort(list);
//      // convert list to linkedhashset to eliminate duplicates
//        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
//
//        list.clear();
//        list.addAll(set
//        System.out.println("Unique ArrayList: " + list);
    }

//    public static int[] eliminateDuplicates(int[] lists) {
//        int[] temp = new int[lists.length];
//        int duplicateNumber = 0; // track how many unique numbers is found.
//
//        for (int i = 0; i < lists.length; i++) {
//            int originalNumber = lists[i];
//
//            boolean alreadyExits = false;
//
//            for (int j = 0; j < duplicateNumber; j++) {
//                if (temp[j] == originalNumber) {
//                    alreadyExits = true;
//                    break;
//                }
//            }
//
//            if (!alreadyExits) {
//                temp[duplicateNumber] = originalNumber;
//                duplicateNumber++;
//            }
//
//        }
//
//        int[] result = new int[duplicateNumber];
//        System.arraycopy(temp, 0, result, 0, duplicateNumber);
//
//        return result;
//    }

//  public static boolean consecutiveMatch(int[] lists){
//    for(int i =0; i < lists.length -  4; i++){
//         if(lists[i] == lists[i + 1] && lists[i] == lists[i + 2] && lists[i] == lists[i + 3]);
//         return true;
//    }
//     return false;
//  }
//  public static int[] ReverseArray(int[] lists){
//
//    for(int i = 0, j = lists.length - 1; i < j; i++, j--){
//          int temp = lists[i];
//          lists[i] = lists[j];
//          lists[j] = temp;
//      }
//     return lists;
//  }

//    public static int LinearSearch(int [] list, int key){
//       for(int i = 0; i < list.length; i++){
//           if(key == list[i])
//               return i;
//       }
//       return -1;
//    }

//    public static int BinarySearch(int [] list, int key){
//
//      int low = 0;
//      int high = list.length - 1;
//
//      while (low <= high){
//          int mid = (low + high) / 2;
//          if(key < list[mid])
//              high = mid - 1;
//          else if(key == list[mid])
//              return mid;
//          else
//              low = mid + 1;
//      }
//
//      return - 1;
//    }

//   public static int BinarySearch(int[] list, int key){
//      int low = 0;
//      int high = list.length - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (key < list[mid])
//                high = mid - 1;
//            else if (key == list[mid])
//                return mid;
//            else
//                low = mid + 1;
//        }
//      return -1;
//   }

//    public static int LinearSearch(int [] list, int key){
//        for( int i = 0; i < list.length; i++){
//            if(key == list[i])
//                return i;
//        }
//        return -1;
//    }
//    public static int PrintLeapYear(int year){
//        if(LeapYear(year)){
//            return 366;
//        }
//        else{
//            return 365;
//        }
//    }
//
//    public static boolean LeapYear(int year){
//        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
//    }
}
