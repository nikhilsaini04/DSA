package com.Nikhil;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LinkedListInsertion {
    private Node head;
    public void insertionAtEnd(int data){
        Node newNode=new Node(data);
        // check is linked list is empty or not
        // if linked list is empty then head pointer will point to the null
        // first make a node then, update head pointer
        if(head==null) {
            head = newNode;
            return;
        }
        Node temp=head;
        // iterate a loop till we do not reach to the last of LL
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListInsertion list=new LinkedListInsertion();
        list.insertionAtEnd(10);
        list.insertionAtEnd(20);
        list.insertionAtEnd(30);
        list.insertionAtEnd(40);
        list.insertionAtEnd(50);
        list.display();
    }
}
