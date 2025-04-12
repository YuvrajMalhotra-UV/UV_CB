package lecc19;

import java.util.Stack;

    public class nge {
        public static void findNextGreaterElements(int[] arr) {
            int n = arr.length;
            int[] result = new int[n]; // nge har element ke liye store krne ke liye
            Stack<Integer> stack = new Stack<>();
    
            // right se left chalenge 
            for (int i = n - 1; i >= 0; i--) {
                // jo current se chote hai unhe bahar nikaalenge 
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
    
                // agar stack empty hogya toh nge hai hi nhi
                result[i] = stack.isEmpty() ? -1 : stack.peek();
    
                // Push the current element to stack
                stack.push(arr[i]);
            }
    
            // Print results
            System.out.println("Next Greater Elements:");
            for (int i = 0; i < n; i++) {
                System.out.println("Element: " + arr[i] + " -> Next Greater: " + result[i]);
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {7, 1, 3, 5, 2, 4, 8, 6};
            findNextGreaterElements(arr);
        }
    }
    
    


