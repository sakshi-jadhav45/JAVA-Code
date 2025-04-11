
interface Stack {
    void push(int value);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}


class IntegerStack implements Stack {
    private int[] stack;
    private int top;
    private int size;

    public IntegerStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

  
    @Override
    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            System.out.println("Popped: " + stack[top]);
            return stack[top--];
        }
    }

    
    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

   
    @Override
    public boolean underflow() {
        return top == -1;
    }
}

public class StackImplementation{
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        stack.pop(); 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); 
        stack.display();
    }
}
