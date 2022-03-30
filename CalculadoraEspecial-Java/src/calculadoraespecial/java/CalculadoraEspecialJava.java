package calculadoraespecial.java;
import java.util.Scanner;
public class CalculadoraEspecialJava {

    public static void main(String[] args) {
        System.out.println("Calculadora");
        System.out.println("Digite el numero de la funcion que desea realizar");
        int accion;
        Scanner leerAccion = new Scanner (System.in);
        System.out.println("Funciones Basicas");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Funciones Especiales");
        System.out.println("5. Valor Absoluto");
        System.out.println("6. Raiz");
        System.out.println("7. Tangente");
        System.out.println("8. Seno");
        accion = leerAccion.nextInt();
        
        FuncionesBasicas Calculadora = new FuncionesBasicas();
        FuncionesEspeciales CalculadoraEspecial = new FuncionesEspeciales();
        switch (accion) {
            
            case 1:
                double sum1, sum2;
                Scanner leerSum1 = new Scanner(System.in);
                Scanner leerSum2 = new Scanner (System.in);
                
                System.out.println("Ingrese el primer valor");
                sum1 = leerSum1.nextDouble();
                
                System.out.println("Ingrese el segundo valor");
                sum2 = leerSum2.nextDouble();
                
                System.out.println(Calculadora.suma(sum1, sum2));
                break;
                
            case 2:
                double resta1,resta2;
                Scanner leerResta1 = new Scanner (System.in);
                Scanner leerResta2 = new Scanner (System.in);
                
                System.out.println("Ingrese el primer valor");
                resta1 = leerResta1.nextDouble();
                
                System.out.println("Ingrese el segundo valor");
                resta2 = leerResta2.nextDouble();
                
                System.out.println(Calculadora.resta(resta1, resta2));
                break;
                
            case 3:
                double mult1, mult2;
                Scanner leerMult1 = new Scanner (System.in);
                Scanner leerMult2 = new Scanner (System.in);
                
                System.out.println("Ingrese el primer valor");
                mult1 = leerMult1.nextDouble();
                
                System.out.println("Ingrese el segundo valor");
                mult2 = leerMult2.nextDouble();
                
                System.out.println(Calculadora.multiplicacion(mult1, mult2));
                break;
                
            case 4:
                double division1, division2;
                Scanner leerDivision1 = new Scanner (System.in);
                Scanner leerDivision2 = new Scanner (System.in);
                
                System.out.println("Ingrese el primer valor");
                division1 = leerDivision1.nextDouble();
                
                System.out.println("Ingrese el segundo valor");
                division2 = leerDivision2.nextDouble();
                
                System.out.println(Calculadora.division(division1, division2));
                break;
                
            case 5:
                
                double abs;
                Scanner leerAbs = new Scanner (System.in);
                
                System.out.println("Ingrese el numero del cual quiera saber su valor absoluto");
                abs = leerAbs.nextDouble();
                
                System.out.println(CalculadoraEspecial.valorAbsoluto(abs));
                break;
                
            case 6:
                double raiz;
                Scanner leerRaiz = new Scanner (System.in);
                
                System.out.println("Ingrese el nuemero del cual desea conocer su raiz");
                raiz = leerRaiz.nextDouble();
                
                System.out.println(CalculadoraEspecial.raiz(raiz));
                break;
                
            case 7:
                double tan;
                Scanner leerTan = new Scanner (System.in);
                
                System.out.println("Ingrese el numero del cual desea saber su tangente");
                tan = leerTan.nextDouble();
                
                System.out.println(CalculadoraEspecial.tangente(tan));
                break;
                
            case 8:
                double sin;
                Scanner leerSin = new Scanner (System.in);
                
                System.out.println("Ingrese el numero del que desee saber su seno");
                sin = leerSin.nextDouble();
                
                System.out.println(CalculadoraEspecial.seno(sin));
                break;
                
        }
    }
    
}
