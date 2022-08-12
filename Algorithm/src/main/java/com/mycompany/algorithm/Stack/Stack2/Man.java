/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithm.Stack.Stack2;

/**
 *
 * @author Ecoinsoft
 */
public class Man {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(12);
        st.push(2);
        st.push(13);
        st.push(16);
        st.push(16);
        st.push(16);
        st.push(16);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println("size is"+st.size());
        System.out.println("Empty ="+st.isEmpty());
        st.show();
    }
            
}
