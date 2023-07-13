import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class questioneight {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int product = 1;
      
        int i = 0;
        int j = arr.length- 1;
      
        while (i < j) {
          product *= arr[i] * arr[j];
          i++;
          j--;
        }
      
        if (i == j) {
          product *= arr[i];
        }
      
        System.out.println( product);
    
      
    }
}