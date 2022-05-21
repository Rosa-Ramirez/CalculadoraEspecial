package calculadoraespecial.java;

public class FuncionesEspeciales extends FuncionesBasicas{
    
    public FuncionesEspeciales(){
        vectorFuncionesBasicas = new String[100];
        indiceVector = 0;
    }    
    public String historialFuncionesEspeciales(String tipo, double primerParametro, double segundoParametro, double resultado){
        indiceVector = indiceVector+1;
        return vectorFuncionesBasicas[indiceVector] = primerParametro+""+tipo+segundoParametro+"Resultado"+resultado;
    }   
    public String historialFuncionesBasicas(String tipo, double Parametro, double resultado){
        indiceVector = indiceVector+1;
        return vectorFuncionesBasicas[indiceVector] = tipo+" "+Parametro+" "+"Resultado: "+" "+resultado;
    }
    public double valorAbsoluto (double numero) {
        double resultado = Math.abs(numero);
        this.historialFuncionesBasicas("Valor absoluto:", numero, resultado);
        return resultado;
    }    
    public double raiz (double raiz) {
        double resultado = Math.sqrt(raiz);
        this.historialFuncionesBasicas("Raiz:", raiz, resultado);
        return resultado;
    }
    public double tangente (double tan) {
        double resultado = Math.tan(tan);
        this.historialFuncionesBasicas("Valor absoluto:", tan, resultado);
        return resultado;
    }
    public double seno (double sin) {
        double resultado = Math.sin(sin);
        this.historialFuncionesBasicas("Valor absoluto:", sin, resultado);
        return resultado;
    }
}
