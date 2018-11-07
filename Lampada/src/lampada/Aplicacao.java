package lampada;

public class Aplicacao {
    public static void main(String[] args) {
        Lampada[][] Painel = new Lampada[5][3];
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Painel[i][j] = new Lampada();
            }
        }
        Painel[0][0].Ligar();
        Painel[0][1].Ligar();
        Painel[0][2].Ligar();
        Painel[1][0].Desligar();
        Painel[1][1].Desligar();
        Painel[1][2].Ligar();
        Painel[2][0].Ligar();
        Painel[2][1].Ligar();
        Painel[2][2].Ligar();
        Painel[3][0].Desligar();
        Painel[3][1].Desligar();
        Painel[3][2].Ligar();
        Painel[4][0].Ligar();
        Painel[4][1].Ligar();
        Painel[4][2].Ligar();
        
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print( Painel[i][j]);
            }
            System.out.println("");
        }   
    }
}