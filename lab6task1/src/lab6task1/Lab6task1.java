package lab6task1;

import java.util.Scanner;

public class Lab6task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array:");

        int arrLen = scan.nextInt();

        int[] arr = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            System.out.println("Enter element at position\"'" + i + "\':");
            arr[i] = scan.nextInt();

        }
        int last = arr.length - 1;
        
        System.out.println("Enter value to search in array:");
        int value = scan.nextInt();
        System.out.println("For Linear Search Press 1\nFor Binary Search Press 2");
        int choice=scan.nextInt();
        
        if(choice==1){
            linearSearch(arr, value);

            System.out.println(value + " is found at index: " + linearSearch(arr, value));
        }else if(choice==2){
            binarySearch(arr, 0, last, value);
        }else{
            System.out.println("Invalid Choice");
        }
    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void binarySearch(int arr[], int first, int last, int value) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < value) {
                first = mid + 1;
            } else if (arr[mid] == value) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}