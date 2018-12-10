package pilhavetor;

/**
 *
 * @author Fabiano Filho
 */
public class PilhaVetor {
    int elemento[];
    int topo; // Onde o vetor está armazenado
public PilhaVetor(){
    elemento = new int[10];
    topo = -1; // posição inváçida do vetor 
}
public void push(int e){
    if (isFull()){
        throw new RuntimeException("Stack Overflow");
    }
    topo++;
    elemento[topo] = e;
}
public int pop(){
    if(isEmpty()){
        throw new RuntimeException ("Empty Stack");
}
    int e;
    e = elemento[topo];
    topo--;
    return e;
}
public int top(){
    if(isEmpty())
        throw new RuntimeException ("Empty Stack");
    return elemento[topo];
}
public boolean isEmpty(){
    return (topo == -1);
        
    }
public boolean isFull(){
    return (topo == 9);
}
}


        

