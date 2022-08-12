/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithm.Stack.Stack2;

/**
 *
 * @author Ecoinsoft
 */
public class Stack {
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    public void push(int data)
    {
        if(size()==capacity)
        {
            expand();
        }
                
        stack[top]=data;
        top++;
    }
    public void show()
    {
        for(int n:stack){
            System.out.println(n+" ");
        }
    }
    public int pop()
    {
         int data=0;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
       
        else
        {top--;
        data=stack[top];
        stack[top]=0;
        shrink();
        }
        return data;
    }
    public int peek()
    {
        int data;
        data=stack[top-1];
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }

    private void expand() {
        int length=size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
        capacity*=2;
    }

    private void shrink() {
        int length=size();
        if(length<=(capacity/2)/2){
            capacity=capacity/2;
        }
        int newStack[]=new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;  
    }
}