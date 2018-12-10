/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabiano Filho
 */
public class PilhaPonteiro {
    private StackNode topOfStack;
    private class StackNode{
        private Object elemento;
        private StackNode next;
        private StackNode (Object e, StackNode n){
            elemento = e;
            next = n;
        }
        }
    public PilhaPonteiro(){
        topOfStack = null;
    }
    
    public void push(Object elemento){
        topOfStack = new StackNode(elemento, topOfStack);
    }
    
    public void pop(){
    if(isEmpty())
        throw new RuntimeException("");    
    topOfStack = topOfStack.next;
    }
    
    public Object top(){
        return topOfStack.elemento;
    }
    
    public boolean isEmpty(){
        return topOfStack == null;
    }
    public void MakeEmpty(){
       topOfStack = null;
    }
    public Object topAndPop () {
        if (isEmpty())  
            return null;    
        Object topElemento = topOfStack.elemento;
        topOfStack = topOfStack.next;
            return topElemento;
    }
}