
package formasgeometricasoo;

public class Triangulo {
    	private Cor borda, preenchimento;
	private Ponto vertice1;
	private Ponto vertice2;
	private Ponto vertice3;

	public Triangulo() {   	
            	preenchimento=new Cor(255,255,255,255);
		borda=new Cor(255,0,0,0);
		vertice1=new Ponto(0,0);
		vertice2=new Ponto(1,0);
		vertice3=new Ponto(0,1);
	}
	public Triangulo(Ponto vertice1,Ponto vertice2,Ponto vertice3) {   	
            	preenchimento=new Cor(255,255,255,255);
		borda=new Cor(255,0,0,0);
		this.vertice1=vertice1;
		this.vertice2=vertice2;
                this.vertice3=vertice3;
	}
	public Triangulo(Ponto vertice1,Ponto vertice2,Ponto vertice3,Cor borda,Cor preenchimento) {
		this.borda=borda;
		this.preenchimento=preenchimento;
		this.vertice1=vertice1;
		this.vertice2=vertice2;
                this.vertice3=vertice3;
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
	public void setVertice1(Ponto vertice1) {
		this.vertice1=vertice1;
	}
	public Ponto getVertice1() {
		return vertice1;
	}
	public void setVertice2(Ponto vertice2) {
		this.vertice2=vertice2;
	}
	public Ponto getVertice2() {
		return vertice2;
	}
	public void setVertice3(Ponto vertice3) {
		this.vertice3=vertice3;
	}
	public Ponto getVertice3() {
		return vertice3;
	}
	public  double area() {
	    double area;
	    area=Math.abs((vertice1.getX()*vertice2.getY()-vertice2.getX()*vertice1.getY())+
                               (vertice2.getX()*vertice3.getY()-vertice3.getX()*vertice2.getY())+
                               (vertice3.getX()*vertice1.getY()-vertice1.getX()*vertice3.getY()))/2;
		return area;
	}
	public  double perimetro() {
	    double perimetro;
	    perimetro=vertice1.distancia(vertice2)+vertice2.distancia(vertice3)+vertice3.distancia(vertice1) ;
		return perimetro;
	}
	public boolean isIn(Ponto p) {
		Triangulo triA = new Triangulo(vertice1, vertice2, p);
		Triangulo triB = new Triangulo(vertice1, vertice3, p);
		Triangulo triC = new Triangulo(vertice2, vertice3, p);
		if(this.area() == triA.area() + triB.area() + triC.area()) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		String s="Forma: Eu sou um Triangulo\n";
		s+=super.toString();
		s+="Caracteristicas Geometricas\n";
		s+="Coordenadas do Vertice 1: ("+vertice1.getX()+","+vertice1.getY()+")\n";
		s+="Coordenadas do Vertice 2: ("+vertice2.getX()+","+vertice2.getY()+")\n";
		s+="Coordenadas do Vertice 3: ("+vertice3.getX()+","+vertice3.getY()+")\n";
		s+="Area:" +area()+"\n";
		s+="Perimetro:" +perimetro()+"\n";
		return s;
	}    
}
