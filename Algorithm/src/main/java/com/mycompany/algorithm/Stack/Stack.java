/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithm.Stack;

/**
 *
 * @author Ecoinsoft
 */
public class Stack {
    int stack[]=new int[5];
    int top=0;
    public void push(int data)
    {
        if(top==5){
            System.out.println("stack is full");
        }else{
        stack[top]=data;
        top++;}
    }
    public void show()
    {
        for(int n:stack){
            System.out.println(n+" ");
        }
    }
    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
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
}
