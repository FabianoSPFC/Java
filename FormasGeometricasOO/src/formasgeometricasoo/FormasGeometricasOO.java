package formasgeometricasoo;
public class FormasGeometricasOO {

    public static void main(String[] args) {
                Retangulo ret; // Um retangulo
		Circulo circ; // Um circulo
                Triangulo tri; // Um triângulo
		Ponto p; // ponto para testar a inclusão
		// variaveis auxliares
		float x1,y1,x2,y2,x3,y3,raio;

                
		// Solicita ao usuario os dados do retângulo
		System.out.println("Dados do Retangulo ");
		x1=Console.readFloat("Informe a coordenada x do primeiro vertice da diagonal");
		y1=Console.readFloat("Informe a coordenada y do primeiro vertice da diagonal");
		x2=Console.readFloat("Informe a coordenada x do segundo vertice da diagonal");
		y2=Console.readFloat("Informe a coordenada y do segundo vertice da diagonal");
		
		// cria uma instância de um retangulo com a as características fornecidas pelo usuário
		ret=new Retangulo(new Ponto(x1,y1),new Ponto(x2,y2));
                
		// Solicita ao usuario os dados do círculo
		System.out.println("Dados do Circulo ");
		x1=Console.readFloat("Informe a coordenada x do centro do circulo");
		y1=Console.readFloat("Informe a coordenada y do centro do circulo");
		raio=Console.readFloat("Informe o raio do circulo");
		
		// cria uma instancia de um círculo com a as características fornecidas pelo usuário
		circ=new Circulo(raio,new Ponto(x1,y1));

		// Solicita ao usuario os dados do triângulo
		System.out.println("Dados do Retangulo ");
		x1=Console.readFloat("Informe a coordenada x do primeiro vertice do triângulo");
		y1=Console.readFloat("Informe a coordenada y do primeiro vertice do triângulo");
		x2=Console.readFloat("Informe a coordenada x do segundo vertice do triângulo");
		y2=Console.readFloat("Informe a coordenada y do segundo vertice do triângulo");
		x3=Console.readFloat("Informe a coordenada x do terceiro vertice do triângulo");
		y3=Console.readFloat("Informe a coordenada y do terceiro vertice do triângulo");
		
		// cria uma instância de um retangulo com a as características fornecidas pelo usuário
		tri=new Triangulo(new Ponto(x1,y1),new Ponto(x2,y2),new Ponto(x3,y3));  
                
		// Solicita dados do ponto para teste de inclusão
		System.out.println("Informe os dados do ponto para testar a inclusao");
                x1=Console.readFloat("Informe a coordenada x do ponto");
		y1=Console.readFloat("Informe a coordenada y do ponto");
		
		// cria uma instância de um ponto com a as características fornecidas pelo usuário		
                p=new Ponto(x1,y1);
        
    	//impressão da área e perímetro do circulo e retângulo 
    	System.out.println("Area do Circulo="+circ.area());
    	System.out.println("Area do Retangulo="+ret.area());
        System.out.println("Area do Triangulo="+tri.area());
    	System.out.println("Perimetro do Circulo="+circ.perimetro());
    	System.out.println("Perimetro do Retangulo"+ret.perimetro());       
     	System.out.println("Perimetro do Triângulo"+tri.perimetro());        
    	// Teste de inclusão para o retângulo
		if (ret.isIn(p))
			System.out.println("O ponto ("+p.getX()+","+p.getY()+") esta dentro do retangulo\n");
		else
			System.out.println("O ponto ("+p.getX()+","+p.getY()+") esta fora do retangulo\n");
     		
        // Teste de inclusão para o círculo	
		if (circ.isIn(p))
			System.out.println("O ponto ("+p.getX()+","+p.getY()+") esta dentro do circulo\n");
		else
			System.out.println("O ponto ("+p.getX()+","+p.getY()+") esta fora do circulo\n");             
    	// Teste de inclusão para o triângulo
		if (tri.isIn(p))
			System.out.println("O ponto ("+p.getX()+","+p.getY()+") esta dentro do triângulo\n");
		else
			System.out.println("O ponto ("+p.getX()+","+p.getY()+") esta fora do triângulo\n");    
    }  
}
