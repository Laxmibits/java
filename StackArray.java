package day9;

public class StackArray {
    int top=-1;
    int[] arr;
    int size;
    public StackArray(int size)
    {
        this.size=size;
        this.arr=new int[size];
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        else{
            arr[++top]=data;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");

        }
        else{
            top--;
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("Empty Stack");
        }
        else{
            for(int i=top;i>=0;--i){
                System.out.println(arr[i]);
            }
        }
    }

public static void main(String args[]){
    StackArray stack=new StackArray(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    stack.pop();
    stack.display();
}

}
    
        
    
    

