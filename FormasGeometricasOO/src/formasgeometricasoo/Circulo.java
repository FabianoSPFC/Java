package formasgeometricasoo;
public class Circulo {
    private Cor borda, preenchimento;
    private double raio;
    private Ponto centro;

    public Circulo() {
	preenchimento=new Cor(255,255,255,255);
	borda=new Cor(255,0,0,0);    	
        raio=1;
        centro=new Ponto();
    }
    public Circulo (double raio, Ponto centro) {
	preenchimento=new Cor(255,255,255,255);
	borda=new Cor(255,0,0,0);
    	this.raio=raio;
        this.centro=centro;
    }
    public Circulo (double raio, Ponto centro,Cor borda,Cor preenchimento)  {
	this.borda=borda;
	this.preenchimento=preenchimento;
    	this.raio=raio;
        this.centro=centro;
    }
    public Cor getCorBorda() {
	return borda;
    }
    public void setCorBorda(Cor borda) {
	this.borda=borda;
    }
    public Cor getCorPreenchimento() {
	return preenchimento;
    }
    public void setCorPreenchimento(Cor preenchimento) {
        this.preenchimento=preenchimento;
    }    
    public void setRaio(double raio) {
        this.raio=raio;
    }
    public double getRaio() {
	return raio;
    }
    public void setCentro(Ponto centro) {
    	this.centro=centro;
    }
    public Ponto getCentro() {
	return centro;
    }
    public double area() {
    	return Math.PI*Math.pow(raio,2);
    }
    public double perimetro() {
    	return Math.PI*2*raio;
    }
    public boolean isIn(Ponto p) {
    	double d;
    	d=centro.distancia(p);
    	if (d<=raio)
    		return true;
        else
        	return false;
    }
    public String toString() {
	String s="Forma: Eu sou um Circulo\n";
	s+="Cor da Borda (a,r,g,b): ("+borda.getAlpha()+","+borda.getRed()+","+borda.getGreen()+","+borda.getBlue()+")\n";
	s+="Cor de Preenchimento: ("+preenchimento.getAlpha()+","+preenchimento.getRed()+","+preenchimento.getGreen()+","+preenchimento.getBlue()+")\n";
        s+="Caracteristicas Geometricas\n";
	s+="Coordenadas do centro: ("+centro.getX()+","+centro.getY()+")\n";
	s+="Raio: "+raio+"\n";
	s+="Area: " +area()+"\n";
	s+="Perimetro: " +perimetro();
	return s;
    }
}
