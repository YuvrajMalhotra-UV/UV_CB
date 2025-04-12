public class stack {
    import java.util.Stack;
 
    public static void findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n]; // Store the NGE for each element
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no greater element on the right
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
        int[] arr = {4, 5, 2, 10, 8};
        findNextGreaterElements(arr);
    }
}



