package listacomarray;

public class ListaEncadeada2 {
    private class ListNode{
        private Comparable element;
        private ListNode next;
        private ListNode( Comparable e,ListNode n){
            element = e;
            next = n;
        }
    }
    
    private ListNode header, previous;
    private int size;
    
    public ListaEncadeada2(){
        header = new ListNode(null, null);
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
          return (header.next==null);
    }
    
    public void addElement(Comparable elem){
        ListNode newElement = new ListNode(elem,null);
        ListNode itr=header;
        int pos=0;
        while(itr.next!=null){
            itr=itr.next;
        }
        itr.next=newElement;
        size++;
    }
    public boolean removeElement(Comparable elem){
        if (isEmpty() || IndexOf(elem)<0)
           return false;
        previous.next = previous.next.next;
        size--;
        return true;
        }
    public void removeAllElements(){
        header.next=null;
        size=0;
    }
    
    private void insertElementAt(Comparable elem,int index){
        if(index<0 || index>size-1){
            return ;
        }else{
            findPrevious(index);
            ListNode newElement = new ListNode(elem, previous.next);
            previous.next=newElement;
        }
        size++;
    }
    public boolean removeElementAt(int index){
        if(index<0 || index>size-1){
            return false;
    }else{
        findPrevious(index);
        previous.next=previous.next.next;
        size--;
}
    return true;
}
    private boolean findPrevious(int index){
        ListNode itr=header.next;
        previous=header;
        for(int i=0;i<size;i++){
            if(i==index)
                return false;
            previous = itr;
            itr=itr.next;
        }
        return true;
    }
    
    public Comparable ElementAt (int index){
        if (index<0 || index>size-1)
            return null;
            ListNode itr=header.next;
            for (int i=0;i<index;i++){
                itr=itr.next;
    }
            return itr.element;
    }
    
    public int IndexOf(Comparable elem){
        ListNode itr= header.next;
        previous = header;
        for (int i=0;i<size;i++){
            if(itr.element.equals(elem)){
                return i;
            }else{
                previous=itr;
                itr=itr.next;
            }
        }
        return -1;
        }
        
    public void printList(){
        if(this.isEmpty())
            return;
        ListNode itr = header.next;
        while(itr!=null){
            System.out.println(itr.element.toString());
            itr=itr.next;
        }
    }
}

