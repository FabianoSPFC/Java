public class No {
    private No prox;
    private Object Element;

    public No(Object element){
        this.Element = element;
        this.prox = prox;
    }
    public No getprox(){
        return prox;
    }
    public void setprox(No prox){
        this.prox = prox;
    }
    public Object getelement(){
        return Element;
    }
    public void setElement(Object Element){
        this.Element = Element;
    }

}