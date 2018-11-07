package lampada;

public class Lampada {
    private char status;
    
public Lampada(){
    this.status = 'o';
    }

public void Ligar(){
    if (status == 'o'){
        this.status = 'o';
    }else{
        this.status = 'x';
    }
}
    public void Desligar(){
        this.status = '-';
    }

    public char getStatus() {
        return status;
    }

    
    @Override
    public String toString() {
        return " "+this.status;
        
    }
    
    
}
