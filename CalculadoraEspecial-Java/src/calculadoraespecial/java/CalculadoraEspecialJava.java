package calculadoraespecial.java;
import java.util.Scanner;
public class CalculadoraEspecialJava {

    public static void main(String[] args) {
        System.out.println("Calculadora");
        System.out.println("Digite el numero de la funcion que desea realizar");
        int accion;
        Scanner escaner = new Scanner (System.in);
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
        accion = escaner.nextInt();
        
        FuncionesBasicas Calculadora = new FuncionesBasicas(); 
        FuncionesEspeciales CalculadoraEspecial = new FuncionesEspeciales();
        switch (accion) {
            case 1:
                double sum1, sum2;
                System.out.println("Ingrese el primer valor");
                sum1 = escaner.nextDouble();
                System.out.println("Ingrese el segundo valor");
                sum2 = escaner.nextDouble();
                System.out.println(Calculadora.suma(sum1, sum2));
                break;
                
            case 2:
                double resta1,resta2;
                System.out.println("Ingrese el primer valor");
                resta1 = escaner.nextDouble();
                System.out.println("Ingrese el segundo valor");
                resta2 = escaner.nextDouble();
                System.out.println(Calculadora.resta(resta1, resta2));
                break;
                
            case 3:
                double mult1, mult2;
                System.out.println("Ingrese el primer valor");
                mult1 = escaner.nextDouble();
                System.out.println("Ingrese el segundo valor");
                mult2 = escaner.nextDouble();
                System.out.println(Calculadora.multiplicacion(mult1, mult2));
                break;
                
            case 4:
                double division1, division2;
                System.out.println("Ingrese el primer valor");
                division1 = escaner.nextDouble();
                System.out.println("Ingrese el segundo valor");
                division2 = escaner.nextDouble();
                System.out.println(Calculadora.division(division1, division2));
                break;
                
            case 5:
                double abs;
                System.out.println("Ingrese el numero del cual quiera saber su valor absoluto");
                abs = escaner.nextDouble();
                System.out.println(CalculadoraEspecial.valorAbsoluto(abs));
                break;
                
            case 6:
                double raiz;
                System.out.println("Ingrese el nuemero del cual desea conocer su raiz");
                raiz = escaner.nextDouble();
                System.out.println(CalculadoraEspecial.raiz(raiz));
                break;
                
            case 7:
                double tan;
                System.out.println("Ingrese el numero del cual desea saber su tangente");
                tan = escaner.nextDouble();
                System.out.println(CalculadoraEspecial.tangente(tan));
                break;
                
            case 8:
                double sin;
                System.out.println("Ingrese el numero del que desee saber su seno");
                sin = escaner.nextDouble();
                System.out.println(CalculadoraEspecial.seno(sin));
                break;
                
        }
    }
    
}
