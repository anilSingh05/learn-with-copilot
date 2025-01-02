package org.example.copilot;


public class ImplementStackUsingCopiilot {

    // Implement Stack using array and provide methods like push, pop, peek, isEmpty, and isFull
    public static class Stack {
        private int top;
        private int[] stack;
        private int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.stack = new int[capacity];
            this.top = -1;
        }

        public void push(int item) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            stack[++top] = item;
            System.out.println(item + " pushed to stack");
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }
}
