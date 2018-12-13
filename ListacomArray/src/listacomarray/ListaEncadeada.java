package listacomarray;

public class ListaEncadeada {
    // Representação
    private ListNode head; 
    private ListNode tail;
    private ListNode previous;
    private int size; 
    private class ListNode {
        private Object element;
        private ListNode next;
        private ListNode(Object e, ListNode n) {
            element=e;
            next=n;
        }
    }
    // Construtores
    public ListaEncadeada() {
        size=0; 
        head=tail=previous=null;
    }
    // Métodos
    public int size() {
        return size;
    } 
    public boolean isEmpty() {
        return (head==null);        
    }
    public void addElement (Object elem) {
        ListNode newElement = new ListNode(elem,null);
        if (head==null)       // insere em uma lista vazia
            head=newElement;
        else 
            tail.next=newElement;
        tail=newElement;
        size++;
    }
    public int indexOf (Object elem ) {
        ListNode itr=head;
        previous=null;
        for (int i=0;i<size;i++) {
            if (itr.element.equals(elem)) {
                return i;
            } 
            else {
                previous=itr;
                itr=itr.next;
            } 
        }   
        return -1;
    }
    private void findPrevious (int index) {
        ListNode itr=head;
        previous=null;
        for (int i=0;i<size;i++) {
            if (i==index)
                return;
            previous=itr;
            itr=itr.next;
        }  
    }
    public Object ElementAt (int index) {
        if (index<0 || index>size-1)
            return null;
        if (index == 0) { // caso particular (previous = null)
            return head.element;
        }
        findPrevious(index);   
        return previous.next.element;
    }
    public void removeElement (Object elem) {
        if (isEmpty() || indexOf(elem)<0) return; // Lista vazia ou o elemento nao esta na lista
        if (previous==null) {  // remove o no head
            if (head==tail)    // caso especial: somente um elemento na lista
                head=tail=null;
            else
                head=head.next;
        }
        else {			// remove um elemento diferente do head
            if (previous.next.equals(tail)) // remoção do tail
                tail=previous;
            previous.next=previous.next.next;          
        }
        size--; 
    }
    public void removeAllElements() {
        head=tail=null;
        size=0;
    }
    public void insertElementAt (Object elem, int index) {
        if (index<0 || index>size-1) 
            return;
        else {
            if (index==0) {                 //insere o elemento na posicao head
                if (head==null)  {        // insere em uma lista vazia
                    ListNode newElement=new ListNode(elem,null);
                    head=tail=newElement;
                }
                else {                  // insere em uma lista com um ou mais elementos
                    ListNode newElement=new ListNode(elem,head);
                    head=newElement;    
                }
            } 
            else {
                findPrevious(index);
                ListNode newElement=new ListNode(elem,previous.next);
                previous.next=newElement;
                if (newElement.next==null)  // o novo elemento e o novo tail
                   tail=newElement;
            }
        }
        size++;
    }
    public boolean removeElementAt (int index) {
        if (index<0 || index>size-1)
            return false;
        else {
            if (index==0) { //remove o elemento na posicao head
                if (head==tail)        // remove de uma lista com um unico elemento
                    head=tail=null;
                else                  // remove de uma lista com mais de um elemento
                    head=head.next;    
            } 
            else { // remove um elemento diferente do head
                findPrevious(index);
                if (previous.next==tail) // considera a remocao do no tail
                    tail=previous;
                previous.next=previous.next.next;
            }
            size--;
        }
        return true;
    }
    public void printList() {
        if (this.isEmpty())  return;
            ListNode itr=head;
            while (itr!=null) {
                System.out.println(itr.element);
                itr=itr.next;
            }
    }
    public void printListv2() {
        for (ListNode itr=head;itr!=null;itr=itr.next) 
            System.out.println(itr.element);
    }
}
