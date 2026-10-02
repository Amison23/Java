package LAB_X;

import java.util.Scanner;

public class Queues {
    int Size  = 1;
    int dataValues[] = new int[Size];
    int front, rear;
       
    Queues(){
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        return front == 0 && rear==Size - 1;
    }
    boolean isEmpty(){
        return front == -1;    
    }
    void enQueue(int newData){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(isEmpty()){
                System.out.println("Enter 11 players ");
                front = 0;
            }
            rear = (rear + 1)% Size;
            dataValues[rear] = newData;
            System.out.println("Inserted " + newData);
        }
    }
    int deQueue(){
        int removedData;
        if(isEmpty()){
            System.out.println("Queue is empty, no Data to remove");
            return -1;
        }else{
            removedData = dataValues[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            }else{
                front = (front + 1)%Size;
            }
            System.out.println("Deleted value is: " + removedData);
            return removedData;
        }
    }
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty, no Data to display");
        }else{
            System.out.println("\nFront index -> "+ front);
            System.out.println("Items-> ");
            
            for(i = front; i !=rear; i= (i+1)%Size){
                System.out.println(dataValues[i] + " ");
            }
            System.out.println(dataValues[i]);
            System.out.println("Rear index->" + rear);
        }
    }

    public static void main(String[] args) {
        Queues a = new Queues();
        Scanner player = new Scanner(System.in);
        
        
       
    }
    
}