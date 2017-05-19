/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Nahian
 */
class Solution18 {
    
    Stack st = new Stack();
    Queue queue = new LinkedList();

    void pushCharacter(char c) {
     st.push(c);
    }
    

    void enqueueCharacter(char c) {
        queue.add(c);
    }

    char popCharacter() {
        return (char) st.pop();
    }

    char dequeueCharacter() {
        
        return (char) queue.remove();
    }
}
