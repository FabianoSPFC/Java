package pilhavetor;

public class Main{
public static void main (String args[] ){
        PilhaVetor p = new PilhaVetor();
        
        p.push(5);
        p.push(8);
        p.push(9);
        p.push(4);
        
        while (!p.isEmpty()){
            int elemento = p.pop();
            System.out.println("Desempilhei Elemento" + elemento);
        }
    }
}
