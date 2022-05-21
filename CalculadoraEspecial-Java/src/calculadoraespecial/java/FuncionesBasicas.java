
package calculadoraespecial.java;

public class FuncionesBasicas {
    String[] historial;
    double numero1;
    double numero2;
    String[] vectorFuncionesBasicas;
    int indiceVector;
   
    public FuncionesBasicas(){
        historial = new String[100];
        indiceVector = 0;
        vectorFuncionesBasicas = new String[100];
    }
    
    public void historial(String tipo, double primerParametro, String signo, double segundoParametro, double resultado){
        indiceVector = indiceVector+1;
        vectorFuncionesBasicas[indiceVector] = tipo+" "+primerParametro+signo+segundoParametro+" "+"Resultado: "+resultado;      
    }
    public void mostrarHistorial(){
        try{
            for(int i = 1; i <vectorFuncionesBasicas.length;i++){
                if (!vectorFuncionesBasicas[i].isEmpty()){
                    System.out.println(vectorFuncionesBasicas[i]);
                }
           }
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       } 
    }    
    public double suma (double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        double resultado = numero1+numero2;
        this.historial("Suma:", numero1, " + ", numero2, resultado);
        return resultado;
    }
    public double resta (double numero1, double numero2) {
        double resultado = numero1 - numero2;
        this.historial("Resta:", numero1, " - ", numero2, resultado);
        return resultado;
    }
    public double multiplicacion (double numero1, double numero2) {
        double resultado = numero1 * numero2;
        this.historial("Multiplicacion:", numero1, " * ", numero2, resultado);
        return resultado;
    }
    public double division (double numero1, double numero2) {
        double resultado = numero1 / numero2;
        this.historial("Division:", numero1, " / ", numero2, resultado);
        return resultado;
    }    
}
