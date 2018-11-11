package formasgeometricasoo;
public class Cor {
	// Atributos
	private int alpha,red,green,blue;

	// Construtores
	public Cor () {
		this.alpha=255;
                this.red=0;
                this.green=0;
                this.blue=0;
	}
        public Cor (int red,int green,int blue) {
		this.alpha=255;
                this.red=red;
                this.green=green;
                this.blue=blue;
	}
	public Cor (int alpha,int red,int green,int blue) {
		this.alpha=alpha;
                this.red=red;
                this.green=green;
                this.blue=blue;
	}
                        
	// Métodos de acesso/Modifica��o
	public void setCor (int alpha,int red,int green,int blue) {
		this.alpha=alpha;
                this.red=red;
                this.green=green;
                this.blue=blue;	
        }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
 
 
 
 
 
 