package description;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Set;

public class MyGeneriStack<T> {
    public LinkedList<T> stack;

    public MyGeneriStack() {
        stack = new LinkedList<T>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
    public static void stackOfString(){
        MyGeneriStack<String> stack = new MyGeneriStack<String>();
        stack.push("Hồng Quân: ");
        stack.push("Bạch Quân: ");
        stack.push("Than Quân: ");
        stack.push("Đen Quân: ");
        stack.push("Xấu Quân: ");
        stack.push("Trắng Quân: ");
        System.out.println("Kích cỡ: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.println("Kích thước sau khi xóa: " + stack.size());
    }
    public static void stackOfInteger(){
        MyGeneriStack<Integer> stack = new MyGeneriStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Kích cỡ: " + stack.size());
        while (!stack.isEmpty()){
            System.out.printf("%d", stack.pop());
        }

        System.out.println("Sau khi xóa: " + stack.size());

    }
}
