class Stack {

    int[] arr = new int[100];
    int top = -1;

    void push(int data) {
        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Popped: " + arr[top]);
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top Element: " + arr[top]);
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();
        s.pop();
        s.peek();
    }
}