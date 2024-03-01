package com.Nikhil;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LinkedList {
    private Node head;
    void insertionAtEnd(int data){
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
    void insertAtIthIndex(int val,int pos){
        Node temp=head;
        Node newNode=new Node(val);
        if(pos==0){
            head=newNode;
            newNode.next=temp;
            return;
        }
        int cnt=0;
        while(cnt<pos-1){
            temp=temp.next;
            cnt++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    void delete(int pos){
        if(pos==0){
            head=head.next;
            return;
        }
        int cnt=0;
        Node temp=head;
        while(cnt<pos-1){
            temp=temp.next;
            cnt++;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertionAtEnd(10);
        list.insertionAtEnd(20);
        list.insertionAtEnd(30);
        list.insertionAtEnd(40);
        list.insertionAtEnd(50);
        list.display();
        list.insertAtIthIndex(60,0);
        System.out.println();
        list.display();
        list.insertAtIthIndex(90,3);
        System.out.println();
        list.display();
        list.delete(0);
        System.out.println();
        list.display();
        list.delete(2);
        System.out.println();
        list.display();

    }
}
