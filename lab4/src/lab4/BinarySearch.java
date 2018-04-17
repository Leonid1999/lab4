/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author lenya
 */
public class BinarySearch {
  
    
    public static int rank(int val, int[] arr) {
        return rank(val, arr, 0, arr.length-1);
    }
    
    private static int rank(int val, int[] arr, int lo, int hi) {
        if (lo > hi) return -1;
        
        int mid = lo + (hi - lo) / 2;
        
        if (val < arr[mid]) {
            return rank(val, arr, lo, mid - 1);
        } else if (val > arr[mid]) {
            return rank(val, arr, mid + 1, hi);
        } else {
            return mid;
        }
    }
}