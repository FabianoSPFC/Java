package morteiro;

public class Morteiro {
    
    private double Angulo;
    private double velocidadeI;
    private static final double Gravidade = 10; //Gravidade com double
    private double A;
    
    
    public Morteiro(double Angulo, double velocidadeI) {
        this.Angulo = Angulo;
        this.velocidadeI = velocidadeI;
    }

    
    public double Alcance(){
        double b;
        double a = this.Angulo;
        b = Math.sin(2*a);
        A= (((this.velocidadeI*this.velocidadeI)*b)/Gravidade);
        return A;
}

    public double getAngulo() {
        return Angulo;
    }

    public void setAngulo(double Angulo) {
        this.Angulo = Angulo;
    }

    public double getVelocidadeI() {
        return velocidadeI;
    }

    public void setVelocidade(double velocidadeI) {
        this.velocidadeI = velocidadeI;
    }

    @Override
    public String toString() {
        return "Morteiro{" + "Angulo=" + Angulo + ", velocidade=" + velocidadeI + '}';
    }
    
}
