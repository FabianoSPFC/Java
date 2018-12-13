
package listacomarray;

public class Lista {
    // Representação
    private Object[] elements;	// array de objetos
    private int size;		// número de elementos na lista
    private int capacity=5;	// capacidade inicial da lista

   // Construtores
    public Lista() {
        elements=new Object[capacity];
        size=0;                  
    }  
    // Métodos
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return (size==0);        
    }
    public void addElement (Object elem) {
        increaseCapacityIfNecessary();
        elements[size]=elem;
        size++;
    }
    private void increaseCapacityIfNecessary() {
        // se não houver mais espaço no array, cria um novo array com o dobro da 
        // capacidade e repassa os elementos atualmente na lista para o novo array
        if  (size==capacity) {
            Object[] newElements=new Object[capacity*2];
            for (int i=0;i<size;i++) 
                newElements[i]=elements[i];
            elements=newElements;
            capacity*=2;
        }    
    }         
    public void removeElement (Object elem) {
        int index=indexOf(elem);
        if (index>=0) removeElementAt(index);
    }
    public int indexOf (Object elem ) {
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
    public boolean insertElementAt (Object elem, int index) {
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
    public Object ElementAt (int index) {
        if (index<0 || index>size-1)
            return null;
        return elements[index];
    }
public void printList() {
    System.out.println("--------------Início-----------------");
    for (int i=0;i<size;i++) 
        System.out.println(elements[i]); // pode omitir a chamada toString   
    System.out.println("--------------Fim-----------------");  
   }
}
