public class Lista_SE_Prova {

    No Head = null;
    No Tail = null;
    int size = 0; //Tamanaho
    
    private boolean isEmpty(){
        return Head == null;
    }
    
    public void addElementHead(Object Element){
        No novo = new No(Element);
        
        if(isEmpty()){
            Head = novo;
            Tail = novo;
        }else{
            novo.setprox(Head);
            Head = novo;
        }
        size ++;
    }
    public Object removeElementHead(){
        if(isEmpty())
            return null;
        No itr = Head;
        Head = itr.getprox();
        itr.setprox(null);
        size --;
        return itr.getelement();
    }
    public void addElementTail(Object Element){
        No novo = new No(Element);
        if(isEmpty()){
            Head = novo;
            Tail = novo;
        }else{
            Tail.setprox(Head);
            Tail = novo;
        }
        size ++;
    }
    public Object removeElementTail(Object Element){
        if(isEmpty()){
            return null;
        }else{
            No itr = Head;
            while (itr != null){
            if (itr.getprox().getprox() == null){ //ou podemos usar que aux.getProx() == fim;
                No itr2 = Tail;
                Tail = itr;
                Tail.setprox(null); //cortando a referência com o último nó
                return itr2.getelement();
            }
            itr = itr.getprox();
        }
        size--;
        return null;
        }
    }
}
