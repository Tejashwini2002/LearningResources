import java.util.Scanner;
class Stack{
    int[] ele;
    int top_of_stack, size=4, item;

    void initStack(int size){
        ele = new int[size];
        top_of_stack = -1;
    }

    void initStack(Stack another){
        ele = new int[another.ele.length];
        top_of_stack = -1;

        for(int item:another.ele){
            push(item);
        }
    }

    void initStack(int[] a){
        ele = new int[a.length];
        top_of_stack = -1;
        for(int item:a){
            push(item);
        }
    }
    void push(int item){
        if(top_of_stack == ele.length -1){
            System.out.println("Stack overflow!");
        }
        else{
            top_of_stack++;
            ele[top_of_stack]=item;
        }
    }
    int pop(){
        if(top_of_stack == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int var = ele[top_of_stack];
            top_of_stack--;
            return var;
        }

    }
    int peek(){
        int  var = ele[top_of_stack];
        return var;
    }
}
public class TW_5a_0 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.initStack(4);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        Stack s2 = new Stack();
        s2.initStack(s1);
        System.out.println("The popped element from s1 is: "+ s1.pop());
        System.out.println("The element on top of stack s2 is: "+s2.peek());
        int[] a = {2,3,4,5};
        Stack s3 = new Stack();
        s3.initStack(a);
        System.out.println("The popped element from s3 is: "+s3.pop());
        System.out.println("The element on top of the stack s3 is: "+s3.peek());
    }
}
