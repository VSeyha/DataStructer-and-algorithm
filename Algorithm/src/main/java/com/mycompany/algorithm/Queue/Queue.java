/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithm.Queue;

/**
 *
 * @author Ecoinsoft
 */
public class Queue {
    int queue[]=new int[5];
    int size; 
    int rear;
    int front;
    public void enQueue(int data)
    {
        queue[rear]=data;
        rear =rear+1;
        size =size +1;
    }
    public void show()
    {
        System.out.println("system element : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(queue[front+i]+" ");
        }
    }
    public int deQueue()
    {
    int data=queue[front];
    front=front+1;
    size=size-1;
    return data;
    
    }
}
