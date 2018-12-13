
package listacomarray;

public class ListaOrdenada {
    // Representação
    private Comparable[] elements;	// array de objetos
    private int size;		// número de elementos na lista
    private int capacity=5;	// capacidade inicial da lista

   // Construtores
    public ListaOrdenada() {
        elements=new Comparable[capacity];
        size=0;                  
    }  
    // Métodos
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return (size==0);        
    }
    public void addElement (Comparable elem) {  
            if (size==0) {
                elements[size]=elem;  
                size++;
            }
            else {
                int pos=0;
                while (pos<size) {
                    if (elements[pos].compareTo(elem)>0) {
                        insertElementAt(elem, pos);
                        return;
                    }
                    pos++;
                } 
                increaseCapacityIfNecessary();
                elements[size]=elem;
                size++;
            }
        
    }
    private void increaseCapacityIfNecessary() {
        // se não houver mais espaço no array, cria um novo array com o dobro da 
        // capacidade e repassa os elementos atualmente na lista para o novo array
        if  (size==capacity) {
            Comparable[] newElements=new Comparable[capacity*2];
            for (int i=0;i<size;i++) 
                newElements[i]=elements[i];
            elements=newElements;
            capacity*=2;
        }    
    }         
    public void removeElement (Comparable elem) {
        int index=indexOf(elem);
        if (index>=0) removeElementAt(index);
    }
    public int indexOf (Comparable elem ) {
        for (int i=0;i<size;i++)
            if (elements[i].equals(elem)) 
                return i;
        return -1;
    }
    public boolean removeElementAt (int index) {
        if (index<0 || index>size-1)
            return false;
        else {
            size--;
            for (int i=index;i<size;i++) 
                elements[i]=elements[i+1];
        }
        return true;
    }
    public void removeAllElements() {
        size=0;
    }
    private boolean insertElementAt (Comparable elem, int index) {
        if (index<0 || index>size-1) {
            return false;
        }
        else {
            increaseCapacityIfNecessary();
            for (int i=size;i>index;i--) 
                elements[i]=elements[i-1];
            elements[index]=elem;
        }
        size++;
        return true;
    }
    public Comparable ElementAt (int index) {
        if (index<0 || index>size-1)
            return null;
        return elements[index];
    }
    public void printList() {
        System.out.println("--------------Início-----------------");
        for (int i=0;i<size;i++) 
            System.out.println(elements[i].toString()); // pode omitir a chamada toString   
        System.out.println("--------------Fim-----------------");  
    }    
 
}
