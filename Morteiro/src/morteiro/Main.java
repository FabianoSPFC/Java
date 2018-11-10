package morteiro;

public class Main {
    
        public static void main(String[] args) {
        
            for(double i=0;i<=(Math.PI)/2;i= i +(Math.PI)/12){ 
            Morteiro M0 = new Morteiro(i,2);
            System.out.println(i);
            System.out.println("Alcance Morteiro -> " + M0.Alcance());
        }
   
    }

}