import java.util.*;

class stack<T> {
    private T[] arr = new T[10];
    private int top = -1;

    public void push(T data) {
        top++;
        arr[top] = data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 9;
    }

    public T pop() {
        if (!isEmpty()) {

            T data = arr[top];
            top--;
            return data;
        }
        T an = new T();
        return an;

    }

    public T peek() {
        return arr[top];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        int num = new Scanner(System.in).nextInt();
        stack<Integer> s = new stack<>();
        s.push(0);

        while (num > 0) {
            int data = s.pop();
            s.push(num % 10);
            data = data * 10 + s.pop();
            s.push(data);
            num /= 10;
        }

        System.out.println(s.pop());

    }

}
