package formasgeometricasoo;


public  class Retangulo  {
	private Cor borda, preenchimento;
	private Ponto p1;
	private Ponto p2;

	public Retangulo() {
		preenchimento=new Cor(255,255,255,255);
		borda=new Cor(255,0,0,0);
		p1=new Ponto(0,0);
		p2=new Ponto(1,1);
	}
	public Retangulo(Ponto p1,Ponto p2) {
		preenchimento=new Cor(255,255,255,255);
		borda=new Cor(255,0,0,0);
		this.p1=p1;
		this.p2=p2;
	}
	public Retangulo(Ponto p1,Ponto p2,Cor borda,Cor preenchimento)  {
		this.borda=borda;
		this.preenchimento=preenchimento;
		this.p1=p1;
		this.p2=p2;
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
	public void setVertice1(Ponto p1) {
		this.p1=p1;
	}
	public Ponto getVertice1() {
		return p1;
	}
	public void setVertice2(Ponto p2) {
		this.p2=p2;
	}
	public Ponto getVertice2() {
		return p2;
	}
	public  double area() {
	    double area;
	    area=Math.abs(p1.getX()-p2.getX()) * Math.abs(p1.getY()-p2.getY()) ;
		return area;
	}
	public  double perimetro() {
	    double perimetro;
	    perimetro=(Math.abs(p1.getX()-p2.getX()) + Math.abs(p1.getY()-p2.getY()))*2 ;
		return perimetro;
	}
	public boolean isIn (Ponto p) {
		double minX,minY,maxX,maxY;
		if (p1.getX()<p2.getX()) {
			minX=p1.getX();
			maxX=p2.getX();
		}
		else {
			minX=p2.getX();
			maxX=p1.getX();
		}
	   if (p1.getY()<p2.getY()) {
			minY=p1.getY();
			maxY=p2.getY();
		}
		else {
			minY=p2.getY();
			maxY=p1.getY();
		}
		if ((p.getX()<minX) || (p.getX()>maxX) || (p.getY()<minY) || (p.getY()>maxY) ) {
			return false;
		}
        return true;
	}
	public String toString() {
		String s="Forma: Eu sou um Retangulo\n";
		s+="Cor da Borda (a,r,g,b): ("+borda.getAlpha()+","+borda.getRed()+","+borda.getGreen()+","+borda.getBlue()+")\n";
		s+="Cor de Preenchimento: ("+preenchimento.getAlpha()+","+preenchimento.getRed()+","+preenchimento.getGreen()+","+preenchimento.getBlue()+")\n";
                s+="Caracteristicas Geometricas\n";
		s+="Coordenadas do Vertice 1: ("+p1.getX()+","+p1.getY()+")\n";
		s+="Coordenadas do Vertice 2: ("+p2.getX()+","+p2.getY()+")\n";
		s+="Area: " +area()+"\n";
		s+="Perimetro: " +perimetro();
		return s;
	}
}