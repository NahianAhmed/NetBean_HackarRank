/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Nahian
 */
class Calculator implements AdvancedArithmetic {
    

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if(n%i==0){
            sum = sum+i;
            }
            
        }
        return sum;
    }
    
}
