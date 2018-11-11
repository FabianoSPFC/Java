package formasgeometricasoo;
public  class Ponto  {
	private double x,y;
	public Ponto() {
		this.x=0.0f;
		this.y=0.0f;
	}
	public Ponto (double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public double distancia(Ponto p) {
		double d;
		d=Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
		return d;
        }
}