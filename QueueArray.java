package day9;

class QueueArray
{
    int rear=-1;
    int front=-1;
    int size;
    int[] arr;
    public QueueArray(int size){
        this.size=size;
        this.arr=new int[size];
    }

    public void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue Overflow");
        }
        else{
            front=0;
            ++rear;
            arr[rear]=data;
        }
    }




    public void dequeue(){
        if(rear==-1 || front>rear){
            System.out.println("Queue Underflow");
        }
        else{
            front++;
        }
    }

    public void display(){
        if(rear==-1 || front>rear){
            System.out.println("Queue Empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[])
    {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }


}
