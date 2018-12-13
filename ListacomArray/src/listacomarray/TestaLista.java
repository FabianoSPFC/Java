
package listacomarray;

public class TestaLista {
    public static void main(String[] args) {
       
        //Roteiro para o teste.
        // 1) Adicione 6 objetos Alunos a Lista e imprima a lista.  
        ListaEncadeada2 list = new ListaEncadeada2();
        list.addElement(new Aluno("Joaquim","111"));
        list.addElement(new Aluno("Maria","222"));       
        list.addElement(new Aluno("José","333"));         
        list.addElement(new Aluno("André","000"));         
        list.addElement(new Aluno("Carlos","555"));  
        list.addElement(new Aluno("Pedro","666")); 
        list.printList();
        
        
    }
    
}
