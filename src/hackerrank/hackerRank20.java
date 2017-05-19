/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import java.util.*;

/**
 *
 * @author Nahian
 */
public class hackerRank20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int x=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n-1; j++) {
               if(a[j]>a[j+1]){
                  int t=a[j+1] ;
                  a[j+1]=a[j];
                  a[j]=t;
                  x++;
                  
               }
               
                
                
            }
        
    
}
       
         System.out.println("Array is sorted in "+x+" swaps");
                System.out.println("First Element: " +a[0]);
                System.out.println("Last Element: " +a[n-1]);
}
}