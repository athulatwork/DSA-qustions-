package com.dsa;

import java.util.Stack;

public class QueueUsingStack {
  static Stack<Integer> stack1 = new Stack<>();
       static  Stack<Integer> stack2 = new Stack<>();
     static  void enqueue(int x){
        stack1.push(x);
      }

     static  int  dequeue(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
      return stack2.pop();
   
      }
    public static void main(String[] args) {
         QueueUsingStack.enqueue(23);
         QueueUsingStack.enqueue(32);
         QueueUsingStack.enqueue(22);
         System.out.println(QueueUsingStack.dequeue());
    }
}
