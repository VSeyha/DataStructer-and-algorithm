/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithm.linkedList;

/**
 *
 * @author Ecoinsoft
 */
public class LinkedList {
    Node head;
    
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(head==null){
            head=node;
        }
        
        else
        {
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    
    public void show(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }System.out.println(node.data);
    }
    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head =node;
    }
    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(index==0){
            insertAtStart(index);
        }
                
       Node n= head;
       for (int i=0;i<index-1;i++){   
            n=n.next;         
        }
       node.next=n.next;
       n.next=node;
    }
    public void deletAdd(int index){
        if(index==0)
        {
            head =head.next;
        }
        else 
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            n1=null;
        }
                
    }
   
}
